import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Biycle200
 */
public class Biycle200 {

    public static void main(String[] args) {
       
        //inventory for one bicycle
        Map<String, Integer> oneBicycle = new HashMap<>();
        oneBicycle.put("seat", 1);
        oneBicycle.put("frame",1);
        oneBicycle.put("brake", 2);
        oneBicycle.put("handbrake",1);
        oneBicycle.put("wheel",1);
        oneBicycle.put("tire", 2);
        oneBicycle.put("chain",1);
        oneBicycle.put("crank",1);
        oneBicycle.put("pedal", 2);
       
        // inventory given
        Map<String, Integer> map = new HashMap<>();
        map.put("seat", 50);
        map.put("frame", 80);
        map.put("brake", 25);
        map.put("handbrake", 100);
        map.put("wheel", 60);
        map.put("tire", 80);
        map.put("chain", 100);
        map.put("crank", 50);
        map.put("pedal", 150);

        // Total bicycle made by given inventory
        Map<String, Integer> totalBicycleMadeByGivenInventory = new HashMap<>();
        totalBicycleMadeByGivenInventory.put("seat", 50/oneBicycle.get("seat"));
        totalBicycleMadeByGivenInventory.put("frame", 80/oneBicycle.get("frame"));
        totalBicycleMadeByGivenInventory.put("brake", 25/oneBicycle.get("brake"));
        totalBicycleMadeByGivenInventory.put("handbrake", 100/oneBicycle.get("handbrake"));
        totalBicycleMadeByGivenInventory.put("wheel", 60/oneBicycle.get("wheel"));
        totalBicycleMadeByGivenInventory.put("tire", 80/oneBicycle.get("tire"));
        totalBicycleMadeByGivenInventory.put("chain", 100/oneBicycle.get("chain"));
        totalBicycleMadeByGivenInventory.put("crank", 50/oneBicycle.get("crank"));
        totalBicycleMadeByGivenInventory.put("pedal", 150/oneBicycle.get("pedal"));
        int min = Integer.MAX_VALUE; 
    
      
        for (Map.Entry<String, Integer> entry : totalBicycleMadeByGivenInventory.entrySet()) {
            if(entry.getValue() < min)
            {
              min = entry.getValue();
            
            }
        }
      
       int maxBicycleMadeByGivenInventory = min;
       
       int totalSeatFor200 = oneBicycle.get("seat")*200;
       int totalFrameFor200 = oneBicycle.get("frame")*200;
       int totalBrakeFor200 = oneBicycle.get("brake")*200;
       int totalHandbrakeFor200 = oneBicycle.get("handbrake")*200;
       int totalwheelFor200 = oneBicycle.get("wheel")*200;
       int totalTireFor200 = oneBicycle.get("tire")*200;
       int totalChainFor200 = oneBicycle.get("chain")*200;
       int totalCrankFor200 = oneBicycle.get("crank")*200;
       int totalPedalFor200 = oneBicycle.get("pedal")*200;

        
       Map<String, Integer> extraInventoryNeed = new HashMap<>();
       extraInventoryNeed.put("seat", totalSeatFor200-map.get("seat"));
       extraInventoryNeed.put("frame", totalFrameFor200-map.get("frame"));
       extraInventoryNeed.put("brake",totalBrakeFor200-map.get("brake"));
       extraInventoryNeed.put("handbrake", totalHandbrakeFor200-map.get("handbrake"));
       extraInventoryNeed.put("wheel", totalwheelFor200-map.get("wheel"));
       extraInventoryNeed.put("tire", totalTireFor200-map.get("tire"));
       extraInventoryNeed.put("chain", totalChainFor200-map.get("chain"));
       extraInventoryNeed.put("crank", totalCrankFor200-map.get("crank"));
       extraInventoryNeed.put("pedal", totalPedalFor200-map.get("pedal"));
       
       System.out.println("bicycle Produce By Given Inventory");
       int maxBicycleProducedByGivenInventory = maxBicycleMadeByGivenInventory;
    System.out.println(maxBicycleProducedByGivenInventory);
System.out.println();
System.out.println();

System.out.println("extra inventory needed for 200 bycicle");
    extraInventoryNeed.entrySet().forEach(entry -> {

        System.out.println(entry.getKey()+"->    "+entry.getValue());
    });
   

}

   
}