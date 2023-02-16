package com.example.infojobsreplicajetpackcompose.features.buscador.data.remote

import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel

class FakeBuscadorRepository {

    companion object {
        val listBuscadorItemsFake: List<BuscadorModel> = List(9) { index ->
            BuscadorModel(
                index = index,
                image = R.drawable.management_solutions,
                position = "afsasfafsasfafsfas",
                company = "afssfaasfsfa",
                date = "fassfa",
                city = "asffassfa",
                typeWork = "fassfa",
                salary = "sfafsa",
                typeOfProcess = "fasfaafsfas"
            )
        }

    }


}