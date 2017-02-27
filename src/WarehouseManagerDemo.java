
public class WarehouseManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDao itemDao = new ItemDaoImpl();
		
		//print all items
		for (Item item : itemDao.getAllItems()){
			System.out.println("Item: "+item.getId()+" Name: "+item.getLong_name());
		}
		
		//update item
		Item item = itemDao.getAllItems().get(0);
		item.setLong_name("To ju¿ nie jest ta sama nazwa tego towaru.");
		itemDao.updateItem(item);
		
		//get item
		itemDao.getItem(0);
		System.out.println("Item: "+item.getId()+" Name: "+item.getLong_name());
	}

}
