package com.example.parafcf;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.OverScroller;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class audit extends AppCompatActivity {
    static boolean bool = false;
    Button atrasA;
    Button terminarA;
    public static int x;
    RadioButton r;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    RadioButton r5;
    RadioButton r6;
    RadioButton r7;
    RadioButton r8;
    RadioButton r9;
    RadioButton r10;
    RadioButton r11;
    RadioButton r12;
    RadioButton r13;
    RadioButton r14;
    RadioButton r15;
    RadioButton r16;
    RadioButton r17;
    RadioButton r18;
    RadioButton r19;
    RadioButton r20;
    RadioButton r21;
    RadioButton r22;
    RadioButton r23;
    RadioButton r24;
    RadioButton r25;
    RadioButton r26;
    RadioButton r27;
    RadioButton r28;
    RadioButton r29;
    RadioButton r30;
    RadioButton r31;
    RadioButton r32;
    RadioButton r33;
    RadioButton r34;
    RadioButton r35;
    RadioButton r36;
    RadioButton r37;
    RadioButton r38;
    RadioButton r39;
    RadioButton r40;
    RadioButton r41;
    RadioButton r42;
    RadioButton r43;
    RadioButton r44;
    RadioButton r45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        r = (RadioButton) findViewById(R.id.radioButton);
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);
        r6 = (RadioButton) findViewById(R.id.radioButton6);
        r7 = (RadioButton) findViewById(R.id.radioButton7);
        r8 = (RadioButton) findViewById(R.id.radioButton8);
        r9 = (RadioButton) findViewById(R.id.radioButton9);
        r10 = (RadioButton) findViewById(R.id.radioButton10);
        r11 = (RadioButton) findViewById(R.id.radioButton11);
        r12 = (RadioButton) findViewById(R.id.radioButton12);
        r13 = (RadioButton) findViewById(R.id.radioButton13);
        r14 = (RadioButton) findViewById(R.id.radioButton14);
        r15 = (RadioButton) findViewById(R.id.radioButton15);
        r16 = (RadioButton) findViewById(R.id.radioButton16);
        r17 = (RadioButton) findViewById(R.id.radioButton17);
        r18 = (RadioButton) findViewById(R.id.radioButton18);
        r19 = (RadioButton) findViewById(R.id.radioButton19);
        r20 = (RadioButton) findViewById(R.id.radioButton20);
        r21 = (RadioButton) findViewById(R.id.radioButton21);
        r22 = (RadioButton) findViewById(R.id.radioButton22);
        r23 = (RadioButton) findViewById(R.id.radioButton23);
        r24 = (RadioButton) findViewById(R.id.radioButton24);
        r25 = (RadioButton) findViewById(R.id.radioButton25);
        r26 = (RadioButton) findViewById(R.id.radioButton26);
        r27 = (RadioButton) findViewById(R.id.radioButton27);
        r28 = (RadioButton) findViewById(R.id.radioButton28);
        r29 = (RadioButton) findViewById(R.id.radioButton29);
        r30 = (RadioButton) findViewById(R.id.radioButton30);
        r31 = (RadioButton) findViewById(R.id.radioButton31);
        r32 = (RadioButton) findViewById(R.id.radioButton32);
        r33 = (RadioButton) findViewById(R.id.radioButton33);
        r34 = (RadioButton) findViewById(R.id.radioButton34);
        r35 = (RadioButton) findViewById(R.id.radioButton35);
        r36 = (RadioButton) findViewById(R.id.radioButton36);
        r37 = (RadioButton) findViewById(R.id.radioButton37);
        r38 = (RadioButton) findViewById(R.id.radioButton38);
        r39 = (RadioButton) findViewById(R.id.radioButton39);
        r40 = (RadioButton) findViewById(R.id.radioButton40);
        r41 = (RadioButton) findViewById(R.id.radioButton41);
        r42 = (RadioButton) findViewById(R.id.radioButton42);
        r43 = (RadioButton) findViewById(R.id.radioButton43);
        r44 = (RadioButton) findViewById(R.id.radioButton44);
        r45 = (RadioButton) findViewById(R.id.radioButton45);

        atrasA = (Button) findViewById(R.id.bAAtras);
        terminarA = (Button) findViewById(R.id.bATerminar);

        atrasA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        terminarA.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                x = Devuelve();
                if (!bool) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(audit.this);
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
                    Intent intent = new Intent(v.getContext(), Terminar_audit.class);
                    startActivityForResult(intent, 0);
                }
            }
        });
    }





    //public void onRadioButtonClicked(View view) {
    // Is the button now checked?
    //   boolean checked = ((RadioButton) view).isChecked();

    // Check which radio button was clicked
    //  switch(view.getId()) {
    //     case R.id.radioButton:
    //       if (checked)

    //        break;
    //case R.id.radioButton1:
    //  if (checked)

    //    break;
    //}
    //}
    public int Devuelve() {
        int cant_puntos = -1;
        int cant_puntos1 = -1;
        int cant_puntos2 = -1;
        int cant_puntos3 = -1;
        int cant_puntos4 = -1;
        int cant_puntos5 = -1;
        int cant_puntos6 = -1;
        int cant_puntos7 = -1;
        int cant_puntos8 = -1;
        int cant_puntos9 = -1;
        int cant_final = 0;

        if (r.isChecked()) {
            cant_puntos = 0;
        } else {
            if (r1.isChecked()) {
                cant_puntos = 1;
            } else {
                if (r2.isChecked()) {
                    cant_puntos = 2;
                } else {
                    if (r3.isChecked()) {
                        cant_puntos = 3;
                    } else {
                        if (r4.isChecked()) {
                            cant_puntos = 4;
                        }
                    }
                }
            }
        }
        if (r5.isChecked()) {
            cant_puntos1 = 0;
        } else {
            if (r6.isChecked()) {
                cant_puntos1 = 1;
            } else {
                if (r7.isChecked()) {
                    cant_puntos1 = 2;
                } else {
                    if (r8.isChecked()) {
                        cant_puntos1 = 3;
                    } else {
                        if (r9.isChecked()) {
                            cant_puntos1 = 4;
                        }
                    }
                }
            }
        }
        if (r10.isChecked()) {
            cant_puntos2 = 0;
        } else {
            if (r11.isChecked()) {
                cant_puntos2 = 1;
            } else {
                if (r12.isChecked()) {
                    cant_puntos2 = 2;
                } else {
                    if (r13.isChecked()) {
                        cant_puntos2 = 3;
                    } else {
                        if (r14.isChecked()) {
                            cant_puntos2 = 4;
                        }
                    }
                }
            }
        }
        if (r15.isChecked()) {
            cant_puntos3 = 0;
        } else {
            if (r16.isChecked()) {
                cant_puntos3 = 1;
            } else {
                if (r17.isChecked()) {
                    cant_puntos3 = 2;
                } else {
                    if (r18.isChecked()) {
                        cant_puntos3 = 3;
                    } else {
                        if (r19.isChecked()) {
                            cant_puntos3 = 4;
                        }
                    }
                }
            }
        }
        if (r20.isChecked()) {
            cant_puntos4 = 0;
        } else {
            if (r21.isChecked()) {
                cant_puntos4 = 1;
            } else {
                if (r22.isChecked()) {
                    cant_puntos4 = 2;
                } else {
                    if (r23.isChecked()) {
                        cant_puntos4 = 3;
                    } else {
                        if (r24.isChecked()) {
                            cant_puntos4 = 4;
                        }
                    }
                }
            }
        }
        if (r25.isChecked()) {
            cant_puntos5 = 0;
        } else {
            if (r26.isChecked()) {
                cant_puntos5 = 1;
            } else {
                if (r27.isChecked()) {
                    cant_puntos5 = 2;
                } else {
                    if (r28.isChecked()) {
                        cant_puntos5 = 3;
                    } else {
                        if (r29.isChecked()) {
                            cant_puntos5 = 4;
                        }
                    }
                }
            }
        }
        if (r30.isChecked()) {
            cant_puntos6 = 0;
        } else {
            if (r31.isChecked()) {
                cant_puntos6 = 1;
            } else {
                if (r32.isChecked()) {
                    cant_puntos6 = 2;
                } else {
                    if (r33.isChecked()) {
                        cant_puntos6 = 3;
                    } else {
                        if (r34.isChecked()) {
                            cant_puntos6 = 4;
                        }
                    }
                }
            }
        }
        if (r35.isChecked()) {
            cant_puntos7 = 0;
        } else {
            if (r36.isChecked()) {
                cant_puntos7 = 1;
            } else {
                if (r37.isChecked()) {
                    cant_puntos7 = 2;
                } else {
                    if (r38.isChecked()) {
                        cant_puntos7 = 3;
                    } else {
                        if (r39.isChecked()) {
                            cant_puntos7 = 4;
                        }
                    }
                }
            }
        }
        if (r40.isChecked()) {
            cant_puntos8 = 0;
        } else {
            if (r41.isChecked()) {
                cant_puntos8 = 2;
            } else {
                if (r42.isChecked()) {
                    cant_puntos8 = 4;
                }
            }
        }
        if (r43.isChecked()) {
            cant_puntos9 = 0;
        } else {
            if (r44.isChecked()) {
                cant_puntos9 = 2;
            } else {
                if (r45.isChecked()) {
                    cant_puntos9 = 4;
                }
            }
        }
        cant_final = cant_puntos + cant_puntos1 + cant_puntos2 + cant_puntos3 + cant_puntos4 + cant_puntos5 + cant_puntos6 + cant_puntos7 + cant_puntos8 + cant_puntos9;

        if (cant_puntos != -1 && cant_puntos1 != -1 && cant_puntos2 != -1 && cant_puntos3 != -1 && cant_puntos4 != -1
                && cant_puntos5 != -1 && cant_puntos6 != -1 && cant_puntos7 != -1 && cant_puntos8 != -1 && cant_puntos9 != -1) {
            bool = true;
        }
        return cant_final;
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
            Intent i = new Intent(audit.this, Acercade.class);
            startActivity(i);


            return true;

        }
        if (id == R.id.action_settings1) {
            AlertDialog.Builder adb = new AlertDialog.Builder(audit.this);
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
