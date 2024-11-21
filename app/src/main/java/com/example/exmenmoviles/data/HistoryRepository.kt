package com.example.exmenmoviles.data

import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.data.api.model.facts.facts
import com.example.exmenmoviles.data.api.model.facts.Result
import com.example.pokedex_lab.data.api.FactsApiClient

class HistoryRepository {
    private val apiHistory = FactsApiClient()

    /**
     * Función para llamar hacer una llamada ala base de datos y obtener la lsita de datos históricos
     *
     * @param callback La función que se llamará con el resultado o el error. Si la llamada es exitosa,
     * [callback] recibirá el resultado como el primer argumento y `null` como segundo argumento.
     * En caso de error, recibirá `null` como primer argumento y una excepción como segundo argumento.
     */
    suspend fun getFactsList(page: Int) :facts? = apiHistory.getFactsList(page)

    fun getFactsListTest(page: Int) :facts?{
        return facts(Result(200, 500, arrayListOf<Data>(
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
        ), null, 1))
    }
}