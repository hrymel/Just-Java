/** in the project's AndroidManifest.xml file.
        **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


import com.example.android.justjava.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = 5;
        displayPrice(quantity * price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is call when the + button is clicked.
     * It increases quantity by 1.
     */
    public void increment(View view){
        quantity ++;
        display(quantity);

    }

    /**
     * This method is call when the - button is clicked.
     * It decreases quantity by 1.
     */
    public void decrement(View view){
        quantity--;
        display(quantity);
    }
}


