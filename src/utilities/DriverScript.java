package utilities;
import commonfuntionlibrary.ERP_functions;

public class DriverScript
{

	public static void main(String[] args) throws Exception
	{
	ExcelFileutil exl=new ExcelFileutil();
	int rc=exl.rowcount("Supplier");
	ERP_functions erp=new ERP_functions();
	for(int i=1;i<rc;i++)
	{
		String sname=exl.getData("Supplier", i, 0);
		String address=exl.getData("Supplier", i, 1);
		String city=exl.getData("Supplier", i, 2);
		String country=exl.getData("Supplier", i, 3);
		String cperson=exl.getData("Supplier", i, 4);
		String phone=exl.getData("Supplier", i, 5);
		String mail=exl.getData("Supplier", i, 6);
		String mnumber=exl.getData("Supplier", i, 7);
		String notes=exl.getData("Supplier", i, 8);
		erp.launchApp("http://webapp.qedge.com/login.php");
		erp.login("admin","master");
		String result=erp.supplier(sname, address, city, country, cperson, phone, mail, mnumber, notes);
		exl.setData("supplier", i, 9, result);
	}
	
	

	}

}
