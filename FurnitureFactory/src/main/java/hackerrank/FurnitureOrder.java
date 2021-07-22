package hackerrank;

import java.util.HashMap;
import java.util. stream.Collectors;

public class FurnitureOrder implements FurnitureOrderInterface {
    
    private final HashMap<Furniture, Integer> furni;

    FurnitureOrder() {
        furni = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        Integer count = 0;
        if(furni.containsKey(type)) {
            count = furnitures.get(type);
        }
        furni.put(type, count + furniCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        
        return new HashMap<Furniture, Integer>(furni);
    }

    public float getTotalOrderCost() {
        if(!furni.isEmpty()) {
            return furni.entrySet().stream().map(f -> f.getKey().cost() * f.getvalue()).collect(Collectors.toList()).stream().reduce(Float::sum).get();
        }
        return -1.0f;
    }

    public int getTypeCount(Furniture type) {
        if(furni.containsKey(type)) {
            return furni.get(type);
        }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        if(furni.containsKey(type)) {
            return furni.get(type) * type.cost();
        }
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        if(!furni.isEmpty()) {
            return furni.values().stream().reduce(Integer::sum).get();
        }
        return -1;
    }
}