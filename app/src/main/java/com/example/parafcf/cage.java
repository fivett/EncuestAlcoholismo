package com.example.parafcf;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class cage extends AppCompatActivity {
    static boolean bool = false;
    Button atras;
    Button terminar;
    RadioButton rC;
    RadioButton r1C;
    RadioButton r2C;
    RadioButton r3C;
    RadioButton r4C;
    RadioButton r5C;
    RadioButton r6C;
    RadioButton r7C;
    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cage);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        atras = (Button) findViewById(R.id.bAtras);
        terminar = (Button) findViewById(R.id.bTerminar);

        rC = (RadioButton) findViewById(R.id.radioButtonC);
        r1C = (RadioButton) findViewById(R.id.radioButtonC1);
        r2C = (RadioButton) findViewById(R.id.radioButtonC2);
        r3C = (RadioButton) findViewById(R.id.radioButtonC3);
        r4C = (RadioButton) findViewById(R.id.radioButtonC4);
        r5C = (RadioButton) findViewById(R.id.radioButtonC5);
        r6C = (RadioButton) findViewById(R.id.radioButtonC6);
        r7C = (RadioButton) findViewById(R.id.radioButtonC7);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res= Devuelve();
                if (!bool) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(cage.this);
                    dialogo1.setTitle("Importante");
                    dialogo1.setMessage("Existen preguntas sin responder");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.dismiss();
                        }
                    });

                    dialogo1.show();

                } else {
                    if (res == 0 || res == 1) {
                        startActivity(new Intent(cage.this,fINAL.class));
                    } else {
                        if (res == 2 || res == 3) {
                            startActivity(new Intent(cage.this,Terminar_cid.class));
                        } else {
                            if (res == 4 || res == 5) {
                                startActivity(new Intent(cage.this,termina.class));
                            } else {
                                if (res == 6 || res == 7) {
                                    startActivity(new Intent(cage.this,Terrminar_cage.class));

                                }
                            }
                        }

                    }

                }
            }
        });


    }

    public int Devuelve() {
        int si = 0;
        int no = 0;
        int suma = 0;

        if (rC.isChecked()) {
            si++;
        }

        if (r1C.isChecked()) {
            no++;
        }

        if (r2C.isChecked()) {
            si++;
        }
        if (r3C.isChecked()) {
            no++;
        }
        if (r4C.isChecked()) {
            si++;
        }
        if (r5C.isChecked()) {
            no++;
        }
        if (r6C.isChecked()) {
            si++;
        }
        if (r7C.isChecked()) {
            no++;
        }


        suma = si + no;
        if (suma == 4) {
            bool = true;
        }

        return si;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(cage.this, Acercade.class);
            startActivity(i);


            return true;

        }
        if (id == R.id.action_settings1) {
            AlertDialog.Builder adb = new AlertDialog.Builder(cage.this);
            adb.setTitle("Salir");
            adb.setMessage("¿Seguro que decea salir?");
            adb.setCancelable(false);
            String yesButtonText = "Si";
            String noButtonText = "No";
            adb.setPositiveButton(yesButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // text.setVisibility(View.INVISIBLE);
                    System.exit(0);
                }
            });
            adb.setNegativeButton(noButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            adb.show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}