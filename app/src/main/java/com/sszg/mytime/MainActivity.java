package com.sszg.mytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView icon = new ImageView(this); // Create an icon
        //icon.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        icon.setBackgroundResource(R.drawable.plus_icon);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this).setContentView(icon)
                .build();

        setDimensions(actionButton, 300, 300);

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.sub);
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();


        SubActionButton.Builder itemBuilder2 = new SubActionButton.Builder(this);
        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.sub);
        SubActionButton button2 = itemBuilder2.setContentView(itemIcon2).build();

        SubActionButton.Builder itemBuilder3 = new SubActionButton.Builder(this);
        ImageView itemIcon3 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.sub);
        SubActionButton button3 = itemBuilder3.setContentView(itemIcon3).build();


        SubActionButton.Builder itemBuilder4 = new SubActionButton.Builder(this);
        ImageView itemIcon4 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.sub);
        SubActionButton button4 = itemBuilder4.setContentView(itemIcon4).build();

        setDimensions(button1, 180, 180);
        setDimensions(button2, 180, 180);
        setDimensions(button3, 180, 180);
        setDimensions(button4, 180, 180);

        // First 3 buttons choose hard coded colors
        // Last button is color picker to choose any color
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .attachTo(actionButton)
                .build();
    }

    private void setDimensions(View view, int width, int height) {
        android.view.ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = width;
        params.height = height;
        view.setLayoutParams(params);
    }
}
