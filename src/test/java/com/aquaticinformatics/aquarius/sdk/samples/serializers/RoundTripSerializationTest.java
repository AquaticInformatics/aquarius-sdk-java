package com.aquaticinformatics.aquarius.sdk.samples.serializers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class RoundTripSerializationTest {

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void format_WithNullInstant_Throws(){
            thrown.expect(NullPointerException.class);

            OffsetDateTimeSerializer.format(null);
        }

        private Object[] validOffsetDateTimeTests() {
            return new Object[]{
                    new Object[]{"Xmas 2015 AEST", ZonedDateTime.parse("2015-12-25T00:00:00+10:00").toOffsetDateTime()},
                    new Object[]{"Xmas 2016 UTC", OffsetDateTime.parse("2016-12-25T00:00:00Z")},
                    new Object[]{"Xmas 2017 PST", ZonedDateTime.parse("2017-12-25T00:00:00-07:00").toOffsetDateTime()},
                    new Object[]{"MaxConcreteValue", OffsetDateTimeDeserializer.MaxConcreteValue},
                    new Object[]{"MinConcreteValue", OffsetDateTimeDeserializer.MinConcreteValue},
                    new Object[]{"MaxValue", OffsetDateTimeDeserializer.MaxValue},
                    new Object[]{"MinValue", OffsetDateTimeDeserializer.MinValue},
            };
        }

        @Test
        @Parameters(method = "validOffsetDateTimeTests")
        public void roundTrip_WithValidOffsetDateTime_ConvertsAsExpected(String reason, OffsetDateTime offsetDateTime){

            String formatted = OffsetDateTimeSerializer.format(offsetDateTime);

            OffsetDateTime actual = OffsetDateTimeDeserializer.parse(formatted);

            assertEquals(reason, actual, offsetDateTime);
        }


}

