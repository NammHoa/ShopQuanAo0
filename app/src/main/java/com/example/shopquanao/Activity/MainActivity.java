package com.example.shopquanao.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shopquanao.Adapter.PopularListAdapter;
import com.example.shopquanao.Domain.PopularDomain;
import com.example.shopquanao.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniRecyclerview();
    }

    private void iniRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("T-Shirt Thể Thao Nam Cooling In Vai","Đặc tính nổi bật \n" +
                "Áo thun nam chất liệu mát mịn, mềm mại tạo cảm giác thoải mái khi tiếp xúc với da\n" +
                "Thông thoáng, thấm hút tốt nhờ công nghệ hoàn tất hiện đại\n" +
                "Sản phẩm có khả năng co giãn đàn hồi tuyệt vời nhờ kết cấu thành phần sợi\n" +
                "Không bai gião, không xù lông, độ bền cao\n" +
                "Áo thun form dáng slimfit ôm vừa phải, phù hợp với nhiều dáng người\n" +
                "Hình in chữ trên vai áo khỏe khoắn, phần nách áo phối lưới thông thoáng giúp mồ hôi thoát nhanh hơn khi người mặc đổ mồ hôi\n" +
                "Áo thun thể thao kết hợp với quần jeans, quần shorts mang đến sự dễ chịu và trẻ trung\n" +
                "Có thể mặc sản phẩm khi ở nhà, đi chơi, hoặc tham gia vào các hoạt động thể thao\n","pic2",15,4.6,149.000));
        items.add(new PopularDomain("Áo Khoác Phao Nam 3s Plus - Trượt Nước, Siêu Ấm","ÁO PHAO NAM 3S PLUS: Siêu nhẹ - Siêu ấm - Siêu gọn - Trượt nước\n" +
                "Thành phần:100% Nylon\n" +
                "Phiên bản nâng cấp của áo phao 3S\n" +
                "Có khả năng trượt nước tới 10 lần giặt\n" +
                "Trọng lượng siêu nhẹ (chỉ ~300gram) nhưng vẫn giữ ấm cơ thể cực tốt, dễ dàng gấp lại và mang đi\n" +
                "Thiết kế vừa vặn, khỏe khoắn thuận tiện cho các hoạt động ngoài trời\n" +
                "Mũ có thể tháo rời, cổ tay áo và gấu chun ôm người, giữ ấm tốt\n" +
                "Túi áo 2 bên có khóa kéo chắc chắn chống rơi đồ, túi rộng dễ để vật dụng cần thiết\n" +
                "YODY - Look good. Feel good.","pic1",20,5.0,349.500));
        items.add(new PopularDomain("Áo Polo Thể Thao Nam Airy Cool Basic","Chất liệu: Thành phần 85% Nylon + 15% Spandex\n" +
                "Công nghệ Aircool tiên tiến giúp giải nhiệt cơ thể cho ngày hè mát mẻ\n" +
                "Kết cấu vải mềm mịn, khô nhanh\n" +
                "Thông thoáng, thấm hút mồ hôi tốt\n" +
                "Khả năng co giãn, giữ form tốt\n" +
                "Độ bền cao\n" +
                "YODY - Look good. Feel good\n" +
                "Sản xuất tại Việt Nam","pic3",20,4.8,349.000));

        recyclerViewPopular=findViewById(R.id.RCVHome);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular=new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}