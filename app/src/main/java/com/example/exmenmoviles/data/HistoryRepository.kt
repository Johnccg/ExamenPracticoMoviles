package com.example.exmenmoviles.data

import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.data.api.model.facts.facts
import com.example.exmenmoviles.data.api.model.facts.Result
import com.example.exmenmoviles.data.api.model.factsObject
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
    suspend fun getFactsList(page: Int) : factsObject? = apiHistory.getFactsList(page)

    fun getFactsListTest(page: Int) :facts?{
        return facts(Result(200, 500, arrayListOf<Data>(
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "Philip V of Macedon is able to take advantage of Roman inactivity. After sacking Thermum, the religious and political centre of Aetolia, Philip is able to force the Aetolians to accept a peace treaty based on his terms.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "In the Battle of Ilipa (Alcalá del Río, near Seville) in Spain, the Carthaginian generals, Mago Barca and Hasdrubal Gisco, are defeated by the Roman general Publius Cornelius Scipio. Mago retreats to Gades (modern Cádiz) and then sails for the Balearic Islands.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "Arsaces II, king of the Parthians, loses territory in battles with Euthydemus I, ruler of Bactria.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "The city of Italica (north west of modern Seville, Spain) is founded by Scipio as a place to settle for the Roman soldiers wounded in the Battle of Ilipa.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "The Roman general Publius Cornelius Scipio secures Gades, thus making Roman control of Spain complete. With the effective withdrawal of the Carthaginians from Spain, Hispania becomes a Roman province.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "The war between Macedonia and Rome drags on with no decided advantage to either side. Rome's interest lies not in conquest, but in keeping Macedon, the Greek city-states and Greek political leagues continually divided and non-threatening.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "Hasdrubal Gisco retreats to the coast and then crosses to North Africa, where he gives his daughter in marriage to Syphax, king of the Numidian Masaesyli tribe, to formalize their military alliance.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
            Data("Object", "By Place", "Carthage", "Historical", "2024-11-20T23:24:04.010Z", "-206", "After having successfully driven the Carthaginians out of Spain, Scipio returns in triumph to Rome and is elected consul. He then prepares to carry the war into Carthage's territory in North Africa.", "year", "en", "bp48snOWj6", "2024-11-20T23:24:04.010Z"),
        ), null, 1))
    }

    fun getFactsListTestError(page: Int) :facts?{
        return facts(Result(400, null, null, "Internal Server Error. Our monkeys are not working today and the devs go out for an exam.", null))
    }
}