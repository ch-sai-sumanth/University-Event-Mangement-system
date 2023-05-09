package com.geekster.Restaurent.services;

import com.geekster.Restaurent.models.Restaurent;
import com.geekster.Restaurent.repository.RestaurentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentServices {

    @Autowired
    RestaurentDao restaurentDao;
    public Restaurent getRestaurentById(int id) {
        for(Restaurent restaurent:restaurentDao.getAll())
        {
            if(restaurent.getRestaurentId()==id)
            {
                return restaurent;
            }
        }
        return null;
    }


    public List<Restaurent> getAllRestaurents() {

        return restaurentDao.getAll();
    }

    public String addRestaurent(Restaurent restaurentDetails) {

        boolean status=restaurentDao.saveRestaurent(restaurentDetails);

        if(status)
            return "restaurent details saved succesfully";

        return "details not added";
    }

    public String updateRestaurentDetails(Restaurent restaurentDetails, int id) {

        boolean status=restaurentDao.updateRestaurentDetails(restaurentDetails,id);
        if(status)
            return "restaurent details updated succesfully";

        return "details not able to update or id not found";
    }

    public String deleteRestaurent(int id) {

        boolean status=restaurentDao.deleteRestaurentRepo(id);

        if(status)
            return "Deleted succesfully";

        return "not able to delete or data not found";
    }
}
