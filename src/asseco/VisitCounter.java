package asseco;

import java.util.HashMap;
import java.util.Map;

public class VisitCounter {

    public Map<Long, Long> count(Map<String, UserStats> stats) {

        //todo zanockuj liste stats i przekaz do metody count
        // Przyjmujemy ze string to jest userID do przeksztalcenia na Long
        //todo odfiltruj z userstats liczbe odwiedzin i dodaj te liczbe do mapy userid long
        //todo zwroc nowa mape z elementami <Long, Long>



        Long counter = stats.get("jakis klucz").visitCount.get();

        if (stats.get("service").visitCount.isPresent()) {   //sprawdza czy ma nulla
            //todo
        }

        Map<Long, Long> result = new HashMap<>();

        for(Map.Entry<String, UserStats> entry: stats.entrySet()) {
            if(entry.getValue().visitCount.isPresent()) {
                Long userID = Long.parseLong(entry.getKey());
                Long visit = entry.getValue().visitCount.get();
                result.put(userID, visit);
            }

        }




        //  stats.get("service").visitCount.orElse(0L);    //jesli napotkasz nulla to daj 0

        //   stats.get("service").visitCount.ifPresent(v -> System.out.println(v)); //System.out::println!!!!!!! //jesli istnieje wartos to cos robi

        //  stats.get("service").visitCount.orElseThrow(() -> new RuntimeException());  //narzuca wyjatek jesli nie ma wartosci


        return result;
    }


}
