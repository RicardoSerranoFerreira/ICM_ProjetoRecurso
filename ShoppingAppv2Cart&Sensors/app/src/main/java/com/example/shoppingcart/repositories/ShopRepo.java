package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "iMac 21", 1299, true, "https://s2.glbimg.com/UtPQgyuHfZrGtYH77LHDjxEnM8I=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/W/m/PJ6zOcTBeXSApdBnoRIw/2016-06-29-1iphone-2g.jpg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Air", 799, true, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/ipad-air-select-wifi-spacegray-202203?wid=1765&hei=2000&fmt=jpeg&qlt=95&.v=1645066742664"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Pro", 999, true, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/ipad-pro-12-11-select-202104_FMT_WHH?wid=2000&hei=2000&fmt=jpeg&qlt=90&.v=1617067383000"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11", 699, false, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone11-select-2019-family_GEO_EMEA?wid=882&hei=1058&fmt=jpeg&qlt=90&.v=1567022219953"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro", 999, true, "https://www.tradeinn.com/f/13735/137354168/apple-iphone-11-pro-64gb-5.8.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro Max", 1099, true, "https://cdn.shopk.it/usercontent/inforcash/media/images/b170987-182348-apple-iphone-11-pro-max-64gb-651.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone SE", 399, true, "https://cf4.certideal.com/22386-thickbox_default/iphone-se-2020-128-gb-vermelho.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Air", 999, true, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/macbook-air-midnight-select-20220606?wid=904&hei=840&fmt=jpeg&qlt=90&.v=1653084303665"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 13", 1299, true, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/mbp-spacegray-select-202206_GEO_PT?wid=904&hei=840&fmt=jpeg&qlt=90&.v=1654014009962"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 16", 2399, true, "https://www.tradeinn.com/f/13841/138412961/apple-computador-portatil-macbook-pro-16-m1-pro-16gb--1tb-ssd.jpg"));
        mutableProductList.setValue(productList);
    }
}
