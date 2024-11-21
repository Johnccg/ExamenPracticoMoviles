package com.example.exmenmoviles.data

import com.example.exmenmoviles.data.api.model.facts.Data
import com.example.exmenmoviles.data.api.model.facts.facts
import com.example.exmenmoviles.data.api.model.facts.Result
import com.example.exmenmoviles.data.api.model.factsObject
import com.example.exmenmoviles.data.api.FactsApiClient
import com.example.exmenmoviles.data.api.model.factsData
import com.example.exmenmoviles.data.api.model.factsResult

class HistoryRepository {
    private val apiHistory = FactsApiClient()

    /**
     * Función para hacer una llamada ala base de datos y obtener la lsita de datos históricos
     *
     * @param page El número de página que se desea consultar.
     * @return Un objeto [factsObject] que contiene los hechos obtenidos
     */
    suspend fun getFactsList(page: Int) : factsObject? = apiHistory.getFactsList(page)

    /**
     * Obtiene datos de prueba siguiendo MVVM para simular una llamada a la base de datos
     * */
    fun getFactsListTest(page: Int) :factsObject?{
        return factsObject(
            factsResult(200, arrayListOf<factsData>(
                factsData("By Place", "Carthage", "Historical", "-206", "After being an ally of Carthage and fighting with them, Numidian chieftain, Masinissa switches sides when the Carthaginians are driven from Spain and offers to assist Rome. Syphax expels his rival Masinissa and claims himself to be King of Numidia. The Romans support Masinissa's claim to the Numidian throne against Syphax, the pro-Carthaginian ruler of the Masaesyli tribe.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "Philip V of Macedon is able to take advantage of Roman inactivity. After sacking Thermum, the religious and political centre of Aetolia, Philip is able to force the Aetolians to accept a peace treaty based on his terms.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "In the Battle of Ilipa (Alcalá del Río, near Seville) in Spain, the Carthaginian generals, Mago Barca and Hasdrubal Gisco, are defeated by the Roman general Publius Cornelius Scipio. Mago retreats to Gades (modern Cádiz) and then sails for the Balearic Islands.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "Arsaces II, king of the Parthians, loses territory in battles with Euthydemus I, ruler of Bactria.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "The city of Italica (north west of modern Seville, Spain) is founded by Scipio as a place to settle for the Roman soldiers wounded in the Battle of Ilipa.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "The Roman general Publius Cornelius Scipio secures Gades, thus making Roman control of Spain complete. With the effective withdrawal of the Carthaginians from Spain, Hispania becomes a Roman province.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "The war between Macedonia and Rome drags on with no decided advantage to either side. Rome's interest lies not in conquest, but in keeping Macedon, the Greek city-states and Greek political leagues continually divided and non-threatening.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "Hasdrubal Gisco retreats to the coast and then crosses to North Africa, where he gives his daughter in marriage to Syphax, king of the Numidian Masaesyli tribe, to formalize their military alliance.", "year"),
                factsData("By Place", "Carthage", "Historical", "-206", "After having successfully driven the Carthaginians out of Spain, Scipio returns in triumph to Rome and is elected consul. He then prepares to carry the war into Carthage's territory in North Africa.", "year"),
        ), null)
        )
    }

    /**
     * Obtiene datos de prueba siguiendo MVVM para simular una llamada a la base de datos que falle
     * */
    fun getFactsListTestError(page: Int) :factsObject?{
        return factsObject(factsResult(400, null,"Internal Server Error. Our monkeys are not working today and the devs go out for an exam."))
    }
}