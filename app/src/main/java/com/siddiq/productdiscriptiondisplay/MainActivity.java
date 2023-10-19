package com.siddiq.productdiscriptiondisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewbtn1;
    Button viewbtn2;
    Button viewbtn3;
    Button viewbtn4;
    Button viewbtn5;
    Button viewbtn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewbtn1 = findViewById(R.id.open);
        viewbtn2 = findViewById(R.id.open2);
        viewbtn3 = findViewById(R.id.open3);
        viewbtn4 = findViewById(R.id.open22);
        viewbtn5 = findViewById(R.id.open4);
        viewbtn6 = findViewById(R.id.open5);
        viewbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,viewscreen1.class);

                intent.putExtra("productid","6");
                intent.putExtra("productname","oppo earbuds");
                intent.putExtra("productspec","Capacity\t6 Kilograms\n" +
                        "Colour\tGrey\n" +
                        "Brand\tWhirlpool\n" +
                        "Product Dimensions\t56D x 54W x 87H Centimeters\n" +
                        "Special Feature\tChild Lock, Extra Durable Body & Low Noise, 740 RPM Fast Motor for Quick Drying\n" +
                        "Cycle Options\tNormal\n" +
                        "Voltage\t230 Volts\n" +
                        "Controls Type\tPush Button\n" +
                        "Maximum Rotational Speed\t740 RPM\n" +
                        "Access Location\tTop Load");
                intent.putExtra("productdes","24 h Battery Life\n" +
                        "Intelligent Call Noise Reduction\n" +
                        "Open-Up Auto Connection\n" +
                        "Low-Latency Game Mode");
                intent.putExtra("productcost","$49");
                startActivity(intent);

            }
        });
        viewbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,viewscreen1.class);

                intent.putExtra("productid","5");
                intent.putExtra("productname","washing mechain");
                intent.putExtra("productspec","Product Dimensions\t56D x 54W x 87H Centimeters\n" +
                        "Brand\tLG\n" +
                        "Capacity\t6.5 Kilograms\n" +
                        "Special Feature\tInverter, Child Lock, High Efficiency, Time Remaining Display, Turbodrum\n" +
                        "Access Location\tTop Load");
                intent.putExtra("productdes","limited period offer: Free 1 Year Extended warranty on purchases from 7th – 9th Oct 2023\n" +
                        "Fully-automatic top load washing machine with TurboDrum: Affordable with great wash quality, Easy to use; has both washing and drying functions\n" +
                        "Capacity : 6.5 kg - Suitable for 3 – 4 members | Couples\n" +
                        "Energy Star rating: 5 Star best in class efficiency; Smart Inverter Technology for up to 36 % energy savings; Energy consumption – 0.0103 KWh/kg/cycle\n" +
                        "Manufacturer Warranty: 2 years on product and 10 years on motor (T&C)\n" +
                        "700 RPM: Higher spin speeds helps in faster wash and drying\n" +
                        "Wash Programs: 08 No. of Programs – Normal: for everyday laundry items made of cotton, linen, and durable synthetics | Gentle : for more fragile items, such as certain sweaters, athletic clothing, undergarments and lingerie, crocheted items | Quick Wash | Strong: for sturdy fabrics such as towels, jeans | Pre-wash+Normal: cold water cycle used for heavily soiled laundry | Aqua reserve: helps in cutting down water wastage | Rinse+: helps to remove any leftover detergent or dirt from your clothes | Tub Clean: keeping your wash drum clean\n" +
                        "TurboDrum enables the most powerful wash and removes the toughest dirt through a strong water stream of rotating drum and pulsator in the opposite direction | Stainless Steel Drum | Panel information: Power On/Off | Start / Pause | Program selection | Process | Water Level section\n" +
                        "Digital display: Displays detailed information concerning the washing machine's work - the current setting, washing time remaining, delayed start, additional settings, error warnings etc\n");
                intent.putExtra("productcost","$459");
                startActivity(intent);
            }
        });

        viewbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,viewscreen1.class);

                intent.putExtra("productid","4");
                intent.putExtra("productname","fridge");
                intent.putExtra("productspec","Product Dimensions\t73.5D x 91.3W x 179H Centimeters\n" +
                        "Brand\tLG\n" +
                        "Capacity\t655 litres\n" +
                        "Configuration\tSide-by-Side\n" +
                        "Colour\tDazzle Steel");
                intent.putExtra("productdes","Product Dimensions\t73.5D x 91.3W x 179H Centimeters\n" +
                        "Brand\tLG\n" +
                        "Capacity\t655 litres\n" +
                        "Configuration\tSide-by-Side\n" +
                        "Colour\tDazzle Steel");
                intent.putExtra("productcost","$4999");
                startActivity(intent);
            }
        });

        viewbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,viewscreen1.class);

                intent.putExtra("productid","3");
                intent.putExtra("productname","iphone 14+");
                intent.putExtra("productspec","Brand\tApple\n" +
                        "Model Name\tIPhone\n" +
                        "Network Service Provider\tUnlocked for All Carriers\n" +
                        "Operating System\tIOS\n" +
                        "Cellular Technology\t5G");
                intent.putExtra("productdes","15.54 cm (6.1-inch) Super Retina XDR display featuring Always-On and ProMotion\n" +
                        "Dynamic Island, a magical new way to interact with iPhone\n" +
                        "48MP Main camera for up to 4x greater resolution\n" +
                        "Cinematic mode now in 4K Dolby Vision up to 30 fps\n" +
                        "Action mode for smooth, steady, handheld videos\n" +
                        "All-day battery life and up to 23 hours of video playback\n" +
                        "Vital safety technology — Crash Detection calls for help when you can’t\n" +
                        "Show More");
                intent.putExtra("productcost","4000");
                startActivity(intent);
            }
        });

        viewbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,viewscreen1.class);

                intent.putExtra("productid","2");
                intent.putExtra("productname","dell laptop vpro");
                intent.putExtra("productspec","Brand\tDell\n" +
                        "Model Name\tInspiron 14 5430\n" +
                        "Screen Size\t14 Inches\n" +
                        "Colour\tSilver\n" +
                        "Hard Disk Size\t1 TB\n" +
                        "CPU Model\tCore i7\n" +
                        "RAM Memory Installed Size\t16 GB\n" +
                        "Operating System\tWindows 11 Home\n" +
                        "Special Feature\tFingerprint Reader, Backlit Keyboard\n" +
                        "Graphics Card Description\tIntegrated");
                intent.putExtra("productdes","Processor: Intel 13th Gen i7-1360P (up to 5.00 GHz) 18MB Cache + 12 Cores RAM: 16 GB, LPDDR5, 4800 MHz // Storage: 1TB SSD\n" +
                        "Software: Pre-Loaded Windows 11 Home with Lifetime Validity | MS Office Home and Student 2021 with lifetime validity| McAfee Multi-Device Security 15-month subscription\n" +
                        "Display: 14.0\" FHD+ WVA AG Non Touch with ComfortView Support 250 nits // Graphics:Intel Iris Xe Graphics // Keyboard: Backlit Keyboard + Fingerprint Reader\n" +
                        "Ports: HDMI 1.4*, (1) Intel Thunderbolt, 4.0, (2) USB 3.2 Gen 1 Type-A, SD card reader, (1) Universal Audio Jack // Battery: 4 Cell, 54");
                intent.putExtra("productcost","4000");
                startActivity(intent);
            }
        });
        viewbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, viewscreen1.class);
                intent.putExtra("productid","1");
                intent.putExtra("productname","smartwatch");
                intent.putExtra("productspec","Brand\tNoise\n" +
                        "Model Name\tColorFit Pro 4 Alpha\n" +
                        "Style\tModern\n" +
                        "Colour\tVintage Brown\n" +
                        "Screen Size\t1.78 Inches");
                intent.putExtra("productdes","1.78\" AMOLED display: See your world in utmost clarity on the 1.78’’ AMOLED display with 368*448 pixel resolution.\n" +
                        "Always on Display: Take your pick from a plethora of Always On Display watch faces and see your day unfold.\n" +
                        "Functional crown: Navigate your way through a series of features with ease, thanks to the fully functional digital crown.\n" +
                        "Tru Sync: Get the best-in-class calling experience with the Tru Sync feature that ensures a stable and fast connection every single time.\n" +
                        "Noise Buzz: Stay connected with the world throughout the day via the Noise Buzz feature that gives you access to a dial pad, call logs and the option to save up to 10 contacts.\n" +
                        "Gesture control: Cover the screen with your palm to turn it off and double-tap it to turn it back on.\n" +
                        "7-day battery with Instacharge: Use your watch for 7 days straight and juice it for another 24 hours in just 10 minutes of charge.\n" +
                        "› See more product details");
                intent.putExtra("productcost","3000");
                startActivity(intent);

            }
        });
    }
}