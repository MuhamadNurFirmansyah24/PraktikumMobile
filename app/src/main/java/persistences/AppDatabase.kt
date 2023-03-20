package persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import model.SetoranBank

@Database(entities = [SetoranBank::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranBankDao(): SetoranBankDao
}
