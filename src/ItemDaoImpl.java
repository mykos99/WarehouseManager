import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
	
	//List is working as a database
	List<Item> items;
	
	public ItemDaoImpl(){
		items = new ArrayList<Item>();
		Item item1 = new Item(0, "EJDN200EPDM", "Expansion joints DN200 EPDM", 20.10);
		Item item2 = new Item(1, "AVPlate50x50", "AV Plate 50x50 cm NBR", 2.10);
		items.add(item1);
		items.add(item2);
	}
	
	//delete one item from database 
	@Override
	public void deleteItem(Item item){
		items.remove(item.getId());
	    System.out.println("Item: [" + item.getId() + "] "+item.getLong_name()+", deleted from database");
	}
	
	//return list of items from database
	@Override
	public List<Item> getAllItems(){
		return items;
	}
	
	@Override
	public Item getItem(int id){
		return items.get(id);
	}
	
	@Override
	public void updateItem(Item item){
		items.get(item.getId()).setShort_name(item.getShort_name());
		items.get(item.getId()).setLong_name(item.getLong_name());
		items.get(item.getId()).setWeight(item.getWeight());
	    System.out.println("Item: [" + item.getId() + "], updated in the database");
	}
}
