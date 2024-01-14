package com.example.parafcf;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class cid extends AppCompatActivity {
    static boolean bool = false;
    Button atrasI;
    Button terminarI;
    RadioButton rI;
    RadioButton r1I;
    RadioButton r2I;
    RadioButton r3I;
    RadioButton r4I;
    RadioButton r5I;
    RadioButton r6I;
    RadioButton r7I;
    RadioButton r8I;
    RadioButton r9I;
    RadioButton r10I;
    RadioButton r11I;
    RadioButton r12I;
    RadioButton r13I;

    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cid);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        atrasI = (Button) findViewById(R.id.bIAtras);
        terminarI = (Button) findViewById(R.id.bITerminar);

        rI = (RadioButton) findViewById(R.id.radioButtonI);
        r1I = (RadioButton) findViewById(R.id.radioButtonI1);
        r2I = (RadioButton) findViewById(R.id.radioButtonI2);
        r3I = (RadioButton) findViewById(R.id.radioButtonI3);
        r4I = (RadioButton) findViewById(R.id.radioButtonI4);
        r5I = (RadioButton) findViewById(R.id.radioButtonI5);
        r6I = (RadioButton) findViewById(R.id.radioButtonI6);
        r7I = (RadioButton) findViewById(R.id.radioButtonI7);
        r8I = (RadioButton) findViewById(R.id.radioButtonI8);
        r9I = (RadioButton) findViewById(R.id.radioButtonI9);
        r10I = (RadioButton) findViewById(R.id.radioButtonI10);
        r11I = (RadioButton) findViewById(R.id.radioButtonI11);
        r12I = (RadioButton) findViewById(R.id.radioButtonI12);
        r13I = (RadioButton) findViewById(R.id.radioButtonI13);

        atrasI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        terminarI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                res = Devuelve();
                if (!bool) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(cid.this);
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
                        startActivity(new Intent(cid.this,fINAL.class));
                    } else {
                        if (res == 2 || res == 3) {
                            startActivity(new Intent(cid.this,Terminar_cid.class));
                        } else {
                            if (res == 4 || res == 5) {
                                startActivity(new Intent(cid.this,termina.class));
                            } else {
                                if (res == 6 || res == 7) {
                                    startActivity(new Intent(cid.this,Terrminar_cage.class));

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

        if (rI.isChecked()) {
            si++;
        }

        if (r1I.isChecked()) {
            no++;
        }

        if (r2I.isChecked()) {
            si++;
        }
        if (r3I.isChecked()) {
            no++;
        }
        if (r4I.isChecked()) {
            si++;
        }
        if (r5I.isChecked()) {
            no++;
        }
        if (r6I.isChecked()) {
            si++;
        }
        if (r7I.isChecked()) {
            no++;
        }
        if (r8I.isChecked()) {
            si++;
        }
        if (r9I.isChecked()) {
            no++;
        }
        if (r10I.isChecked()) {
            si++;
        }
        if (r11I.isChecked()) {
            no++;
        }
        if (r12I.isChecked()) {
            si++;
        }
        if (r13I.isChecked()) {
            no++;
        }

        suma = si + no;
        if (suma == 7) {
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
            Intent i = new Intent(cid.this, Acercade.class);
            startActivity(i);


            return true;

        }
        if (id == R.id.action_settings1) {
            AlertDialog.Builder adb = new AlertDialog.Builder(cid.this);
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