package communityuni.com;

public class TachChuoiLinkBaiHat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		String nguon = "D:/music/bolero/longme.mp3";
        StringBuilder sb = new StringBuilder(nguon);

        
        int GachCuoi = sb.lastIndexOf("/");
        String TenFile = sb.substring(GachCuoi + 1);
        System.out.println("Tên file: " + TenFile);

       
        StringBuilder sbFile = new StringBuilder(TenFile);

       
        int dotIndex = sbFile.lastIndexOf(".");
        String TenOnly = sbFile.substring(0, dotIndex);
        System.out.println("Tên không đuôi: " + TenOnly);
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	
	finally
	{
		System.out.println("finally");

	}
	
	}

}
