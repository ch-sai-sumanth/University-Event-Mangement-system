package com.geekster.Restaurent.repository;

import com.geekster.Restaurent.models.Restaurent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurentDao {

    List<Restaurent> restaurentList=new ArrayList<>();
    public List<Restaurent> getAll() {
        return restaurentList;
    }

    public boolean saveRestaurent(Restaurent restaurentDetails) {
        restaurentList.add(restaurentDetails);
        return true;
    }

    public boolean updateRestaurentDetails(Restaurent restaurentDetails, int id) {

        for(Restaurent restaurent:restaurentList)
        {
            if(restaurent.getRestaurentId()==id) {
                restaurentList.remove(restaurent);
                restaurentList.add(restaurentDetails);
                return true;
            }
        }
        return false;
    }

    public boolean deleteRestaurentRepo(int id) {

        for(Restaurent restaurent:restaurentList)
        {
            if(restaurent.getRestaurentId()==id)
            {
                restaurentList.remove(restaurent);
                return true;
            }
        }
        return false;
    }
}
