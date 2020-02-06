package aggiregation;

public class orders {
	
	

	int id;
	String orderid;
	String product;
	user userid;//entitiy referance
	
	
	orders(int id,String orderId,String product,user userid){
        this.id=id;
        this.orderid=orderId;
        this.product=product;
        this.userid=userid;
    }

   private void showData(){
       System.out.println(
               "id : "+id+"\n"+
               "orderid : "+orderid+"\n"+
               "product : "+product+"\n"+
               "userid : "+userid.id+"\n"+
               "name : "+userid.name
               );
   }


    public static void main(String[] args) {

        user user=new user(1,"Abc");
        orders orders=new orders(1,"ORD-1","mobile",user);
        orders.showData();

    }

}
