package com.example.parafcf;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

public class Terminar_audit extends AppCompatActivity {

    TextView textDevol;
    int res;
    TextView texto;
    TextView nota;
    ProgressBar progressBar;
    DBHandler db;
    Button regresar;
    TextView texto1;
    CardView cvF;
    TextView textf;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminar_audit);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textf = (TextView) findViewById(R.id.textF);

        cvF = (CardView) findViewById(R.id.cardFondo);

        texto1 = (TextView) findViewById(R.id.t);
        db = new DBHandler(getApplicationContext());
        regresar = (Button) findViewById(R.id.regresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
                //baseDato();
            }
        });

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);


        res = audit.x;
        textDevol = (TextView) findViewById(R.id.valor);
        texto = (TextView) findViewById(R.id.texto);
        nota = (TextView) findViewById(R.id.nota);
        textDevol.setText(Integer.toString(res));
        if (res >= 0 && res <= 7) {
            progressBar.setProgress(res);
            texto.setText("Riesgo Bajo");
            db.insertRecord("Riesgo Bajo");
            cvF.setCardBackgroundColor(0xFF2ECC71); //Para cambiar el color de un Card View desde el codigo
            nota.setText("Probablemente usted no tenga un problema con el alcohol. Siga bebiendo con moderación o no beba nada en absoluto.");
        } else {
            if (res >= 8 && res <= 15) {
                progressBar.setProgress(res);
                texto.setText("Riesgo Medio");
                db.insertRecord("Riesgo Medio");
                cvF.setCardBackgroundColor(0xFFAFD418);
                nota.setText("Puede que en ocasiones beba demasiado. Esto puede ponerle a usted o a otros en riesgo. Intente reducir el consumo de alcohol o deje de beber completamente.");
            } else {
                if (res >= 16 && res <= 19) {
                    progressBar.setProgress(res);
                    texto.setText("Riesgo Alto");
                    db.insertRecord("Riesgo Alto");
                    cvF.setCardBackgroundColor(0xFFEC7063);
                    nota.setText("Su consumo de alcohol podría causarle daños, si no lo ha hecho ya. Es importante que reduzca el consumo de alcohol o que deje de beber completamente. Pida a su médico o enfermera/o asesoramiento sobre cómo es mejor reducir el consumo.");
                } else {
                    if (res >= 20 && res <= 40) {
                        progressBar.setProgress(res);
                        texto.setText("Probable adicción");
                        db.insertRecord("Probable adicción");
                        cvF.setCardBackgroundColor(0xFFE74C3C);
                        nota.setText("Es probable que su consumo de alcohol le esté causando daños. Hable con su médico o enfermera/o, o con un especialista en adicciones. Pida medicación y asesoramiento que puedan ayudarle a dejar la bebida. Si tiene problemas de alcoholismo, no deje de beber sin la ayuda de un profesional sanitario.");
                    }
                }
            }
        }
    }

    //public void baseDato() {
        //db.insertRecord(texto.getText().toString());
    //}

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
            Intent i = new Intent(Terminar_audit.this, Acercade.class);
            startActivity(i);


            return true;

        }
        if (id == R.id.action_settings1) {
            AlertDialog.Builder adb = new AlertDialog.Builder(Terminar_audit.this);
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