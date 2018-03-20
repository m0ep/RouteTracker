package de.florianm.android.routetracker.db

import android.arch.persistence.room.TypeConverter
import org.threeten.bp.LocalDate
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.format.DateTimeFormatter


class ThreeTenBpConverters {

    @TypeConverter
    fun fromOffsetDateTime(offsetDateTime: OffsetDateTime?): String? {
        return if (null == offsetDateTime) {
            null
        } else {
            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime)
        }
    }

    @TypeConverter
    fun toOffsetDateTime(value: String?): OffsetDateTime? {
        return if (null == value) {
            null
        } else {
            DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(value) as OffsetDateTime?
        }
    }

    @TypeConverter
    fun fromLocalDate(localDate: LocalDate?): String? {
        return if (null == localDate) {
            null
        } else {
            DateTimeFormatter.ISO_LOCAL_DATE.format(localDate)
        }
    }

    fun toLocalDate(value: String?): LocalDate? {
        return if (null == value) {
            null
        } else {
            DateTimeFormatter.ISO_LOCAL_DATE.parse(value) as LocalDate
        }
    }
}