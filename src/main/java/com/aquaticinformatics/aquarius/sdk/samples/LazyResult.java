package com.aquaticinformatics.aquarius.sdk.samples;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LazyResult<TDomainObject> implements Iterator<TDomainObject>
{
    public LazyResult(Consumer<String> setCursorAction, Supplier<IPaginatedResponse<TDomainObject>> getNextPageFunc) {
        _setCursorAction = setCursorAction;
        _getNextPageFunc = getNextPageFunc;
        _count = 0;

        setCursor(null);
        getNextPage();

        _totalCount = _currentPage.getTotalCount();
    }

    private Consumer<String> _setCursorAction;
    private Supplier<IPaginatedResponse<TDomainObject>> _getNextPageFunc;

    private IPaginatedResponse<TDomainObject> _currentPage;
    private int _currentPageIndex;
    private int _count;
    private int _totalCount;

    public int getTotalCount() {
        return _totalCount;
    }

    private void setCursor(String value) {
        _setCursorAction.accept(value);
    }

    private void getNextPage() {
        _currentPage = _getNextPageFunc.get();
        _currentPageIndex = 0;
        System.out.printf("Fetched a page of %d items (TotalCount=%d)\n", _currentPage.getDomainObjects().size(), _currentPage.getTotalCount());
    }

    @Override
    public boolean hasNext() {
        if (!isCurrentPageConsumed())
        {
            return true;
        }

        if (isFinalPage())
        {
            return false;
        }

        fetchNextPage();

        return true;
    }

    private boolean isCurrentPageConsumed() {
        return _currentPageIndex >= _currentPage.getDomainObjects().size();
    }

    private boolean isFinalPage() {
        return _count >= _totalCount
                || _count >= _currentPage.getTotalCount()
                || _currentPage.getDomainObjects().isEmpty()
                || _currentPage.getCursor() == null
                || _currentPage.getCursor().length() == 0;
    }

    private void fetchNextPage() {
        setCursor(_currentPage.getCursor());;
        getNextPage();
    }

    @Override
    public TDomainObject next() {
        if (!hasNext())
            throw new NoSuchElementException();

        ++_count;
        return _currentPage.getDomainObjects().get(_currentPageIndex++);
    }
}
