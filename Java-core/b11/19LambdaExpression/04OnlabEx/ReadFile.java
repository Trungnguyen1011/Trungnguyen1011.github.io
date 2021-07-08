import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    public List<Product> listProduct;
    public void getProduct(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("Products.json")){

           this.listProduct = new Gson().fromJson(reader, new TypeToken<List<Product>>() {}.getType());
            reader.close();
            

           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}
}