package Homework23.service;

import Homework23.exception.ShopException;
import Homework23.model.Shop;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import org.yaml.snakeyaml.events.Event;

import java.util.*;

@Service
@SessionScope
public class ShopService {
    List<Shop> list = new ArrayList<>();

    public List<Integer> addId(List<Integer> ID) {
        if(ID.isEmpty()){
            throw new ShopException();
        }
        for (Integer arg : ID) {
            list.add(new Shop(arg));
        }
        return ID;
    }

    public Collection<Shop> getId() {
        return Collections.unmodifiableList(list);
    }
}
