package com.example.project_pv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button bp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bp5=(Button) findViewById(R.id.button4);
        bp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinner_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        radioGroup=findViewById(R.id.radioGroup);
        Button buttonOK = findViewById(R.id.button);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final TextView longpan =(TextView)findViewById(R.id.textView4);

                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);

                final TextView lonf =(TextView)findViewById(R.id.textView3);
                String lh1 = (String) lonf.getText().toString();
                int lh1f = Integer.parseInt(lh1);

                final EditText dis1 =(EditText) findViewById(R.id.Distance);
                String dis = (String) dis1.getText().toString();
                int disf = Integer.parseInt(dis);

                final TextView hypr =(TextView)findViewById(R.id.textView11);
                final TextView adjr =(TextView)findViewById(R.id.textView13);
                final TextView oppr =(TextView)findViewById(R.id.textView12);
                String etage = (String) radioButton.getText().toString();
                switch(etage)
                {
                    case "1 étage":
                        int hyp=lh1f-disf;
                        int adj= (int) (hyp*0.899);
                        int opp= (int) (hyp*0.5);
                        hypr.setText(Integer.toString(hyp));
                        adjr.setText(Integer.toString(adj));
                        oppr.setText(Integer.toString(opp));


                        break;
                    case "2 étage":
                        int hyp2= (int) (((lh1f*2)+2.5)-disf);
                        int adj2= (int) (hyp2*0.899);
                        int opp2= (int) (hyp2*0.5);
                        hypr.setText(Integer.toString(hyp2));
                        adjr.setText(Integer.toString(adj2));
                        oppr.setText(Integer.toString(opp2));
                        break;

                    case "3 étage":
                        int hyp3= (int) (((lh1f*3)+2.5)-disf);
                        int adj3= (int) (hyp3*0.899);
                        int opp3= (int) (hyp3*0.5);
                        hypr.setText(Integer.toString(hyp3));
                        adjr.setText(Integer.toString(adj3));
                        oppr.setText(Integer.toString(opp3));
                        break;
                }

            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        String marque = parent.getItemAtPosition(i).toString();
        switch (marque)
        {
            case "choisir votre panneau":
                final TextView lon =(TextView)findViewById(R.id.textView3);
                 lon.setText(R.string.pardefaut1) ;
                final TextView lar =(TextView)findViewById(R.id.textView5);
                lar.setText(R.string.pardefaut1) ;
                break;
            case "Panneau Jonsol Monocristallin 320_340 W":
                final TextView lon1 =(TextView)findViewById(R.id.textView3);
                lon1.setText(R.string.lojons1) ;
                final TextView lar11 =(TextView)findViewById(R.id.textView5);
                lar11.setText(R.string.larjon11) ;
                break;
            case "Panneau Jonsol Monocristallin 375_390 W":
                final TextView lon2 =(TextView)findViewById(R.id.textView3);
                lon2.setText(R.string.lojons2) ;
                final TextView lar22 =(TextView)findViewById(R.id.textView5);
                lar22.setText(R.string.larjon22) ;
                break;
            case "Panneau Jonsol Monocristallin 390_415 W":
                final TextView lon3 =(TextView)findViewById(R.id.textView3);
                lon3.setText(R.string.lojons3) ;
                final TextView lar33 =(TextView)findViewById(R.id.textView5);
                lar33.setText(R.string.larjon33) ;
                break;
            case "Panneau Jonsol Monocristallin 430_450 W":
                final TextView lon4 =(TextView)findViewById(R.id.textView3);
                lon4.setText(R.string.lojons4) ;
                final TextView lar44 =(TextView)findViewById(R.id.textView5);
                lar44.setText(R.string.larjon44) ;
                break;
            case "Panneau Jonsol Monocristallin 530_550 W":
                final TextView lon5 =(TextView)findViewById(R.id.textView3);
                lon5.setText(R.string.lojons5) ;
                final TextView lar55 =(TextView)findViewById(R.id.textView5);
                lar55.setText(R.string.larjon55) ;
                break;
            case "Panneau Axitec Monocristallin 350_380 W":
                final TextView lonax1 =(TextView)findViewById(R.id.textView3);
                lonax1.setText(R.string.longeuraxitec1) ;
                final TextView larax11 =(TextView)findViewById(R.id.textView5);
                larax11.setText(R.string.largeuraxitec11) ;
                break;
            case "Panneau Axitec Monocristallin 390_410 W":
                final TextView lonax2 =(TextView)findViewById(R.id.textView3);
                lonax2.setText(R.string.longeuraxitec2) ;
                final TextView larax22 =(TextView)findViewById(R.id.textView5);
                larax22.setText(R.string.largeuraxitec22) ;
                break;
            case "Panneau Axitec Monocristallin 430_455 W":
                final TextView lonax3 =(TextView)findViewById(R.id.textView3);
                lonax3.setText(R.string.longeuraxitec3) ;
                final TextView larax33 =(TextView)findViewById(R.id.textView5);
                larax33.setText(R.string.largeuraxitec33) ;
                break;
            case "Panneau Axitec Monocristallin 530_545 W":
                final TextView lonax4 =(TextView)findViewById(R.id.textView3);
                lonax4.setText(R.string.longeuraxitec4) ;
                final TextView larax44 =(TextView)findViewById(R.id.textView5);
                larax44.setText(R.string.largeuraxitec44) ;
                break;



        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}