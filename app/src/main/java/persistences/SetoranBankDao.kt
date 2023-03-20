package persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import model.SetoranBank

@Dao
interface SetoranBankDao {


    @Query("SELECT * FROM SetoranBank")
    fun loadAll(): LiveData<List<SetoranBank>>
    @Query("SELECT * FROM SetoranBank WHERE id = :id")
    fun find(id: String): SetoranBank?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: SetoranBank)
    @Delete
    fun delete(item: SetoranBank)

}

