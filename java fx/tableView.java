public class FXML_search_productController implements Initializable {
    @FXML
    private ComboBox<String> category = new ComboBox();
    @FXML
    private TableView<Product> products;

    @FXML
    private TableColumn<Product,String> barcode;
    @FXML
    private TableColumn<Product,String> name;
    @FXML
    private TableColumn<Product,Integer> qty;
    @FXML
    private TableColumn<Product,Float> p_price;
    @FXML
    private TableColumn<Product,Float> s_price;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<Product> data = FXCollections.observableArrayList();
        Product p = new Product("123","aaaa",10, 20.5f,30.5f);
        data.add(p);
        
        barcode.setCellValueFactory(new PropertyValueFactory<Product,String>("Barcode"));
        name.setCellValueFactory(new PropertyValueFactory<Product,String>("Name"));
        qty.setCellValueFactory(new PropertyValueFactory<Product,Integer>("Qty"));
        p_price.setCellValueFactory(new PropertyValueFactory<Product,Float>("Pprice"));
        s_price.setCellValueFactory(new PropertyValueFactory<Product,Float>("Sprice"));

        products.setItems(data);
        
        try {
            Database db = new Database();
            Connection c = db.getConnection();
            ResultSet rs = c.createStatement().executeQuery("select name from categories");
            while(rs.next()){
                category.getItems().add(rs.getString("name"));
            }
            
            
        } catch (SQLException ex) {
            
        }
    }    
    
}





/*
*	Product Class Product.java
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;

/**
 *
 * @author mahmud
 */
public class Product {
    // note all variable name is capitalized. beause of camel caps getter method name
    private String Barcode, Name;
    private int Qty;
    private float Pprice,Sprice;
    
    public Product(String barcode, String name, int qty, float p_price, float s_price){
        this.Barcode = barcode;
        this.Name = name;
        this.Qty = qty;
        this.Pprice = p_price;
        this.Sprice = s_price;
        
    }
    public String getBarcode(){
        return this.Barcode;
    }
    public String getName(){
        return this.Name;
    }
    public int getQty(){
        return this.Qty;
    }
    public float getPprice(){
        return this.Pprice;
    }
    public float getSprice(){
        return this.Sprice;
    }
}
