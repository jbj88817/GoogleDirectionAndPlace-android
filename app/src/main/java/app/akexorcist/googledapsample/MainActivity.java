/*
 * Copyright (c) 2013 Akexorcist
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package app.akexorcist.googledapsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    	Button buttonSimpleDirection = (Button)findViewById(R.id.buttonSimpleDirection);
    	buttonSimpleDirection.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SimpleDirection.class);
				startActivity(intent);
			}
		});
        
    	Button buttonDirection1 = (Button)findViewById(R.id.buttonDirection01);
    	buttonDirection1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, DirectionActivity1.class);
				startActivity(intent);
			}
		});
        
    	Button buttonDirection2 = (Button)findViewById(R.id.buttonDirection02);
    	buttonDirection2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, DirectionActivity2.class);
				startActivity(intent);
			}
		});
        
    	Button buttonDirection3 = (Button)findViewById(R.id.buttonDirection03);
    	buttonDirection3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, DirectionActivity3.class);
				startActivity(intent);
			}
		});
        
    	Button buttonPlace1 = (Button)findViewById(R.id.buttonPlace01);
    	buttonPlace1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, PlaceActivity1.class);
				startActivity(intent);
			}
		});
        
    	Button buttonPlace2 = (Button)findViewById(R.id.buttonPlace02);
    	buttonPlace2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, PlaceActivity2.class);
				startActivity(intent);
			}
		});
        
    	Button buttonPlace3 = (Button)findViewById(R.id.buttonPlace03);
    	buttonPlace3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, PlaceActivity3.class);
				startActivity(intent);
			}
		});
    }
}
