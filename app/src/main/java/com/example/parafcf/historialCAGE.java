package com.example.parafcf;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

public class historialCAGE extends AppCompatActivity {

    private PieChart pieChart;
    TextView tt;
    TextView tt1;
    TextView tt2;
    TextView tt3;
    TextView tt4;
    DBHandler db;
    String a;
    String[] arg;
    int rb;
    int rm;
    int ra;
    int pa;
    int total;
    private int[] sale = new int[]{20,30,10,40};
    private int[] colors = new int[]{0xFF2ECC71, 0xFFAFD418, 0xFFEC7063, 0xFFE74C3C};
    private String[]months=new String[]{"Riesgo Bajo","Riesgo Medio","Riesgo Alto","Probable adicción"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tt = (TextView) findViewById(R.id.t);
        tt1 = (TextView) findViewById(R.id.t1);
        tt2 = (TextView) findViewById(R.id.t2);
        tt3 = (TextView) findViewById(R.id.t3);
        tt4 = (TextView) findViewById(R.id.t4);
        db = new DBHandler(getApplicationContext());
        muestra();
        pieChart = (PieChart) findViewById(R.id.pieChart);
        createCharts();


        // tt.setText(db.getRecords()); //Para obtener todos los valores y comprobar con los resultados


    }

    private Chart getSameChart(Chart chart, String descrption, int textColor, int background, int animateY) {
        chart.getDescription().setText(descrption);
        chart.getDescription().setTextSize(15);
        chart.setBackgroundColor(background);
        chart.animateY(animateY);
        legend(chart);
        return chart;
    }

    private void legend(Chart chart) {
        Legend legend = chart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        ArrayList<LegendEntry> entries = new ArrayList<>();
        for (int i = 0; i < months.length; i++) {
            LegendEntry entry = new LegendEntry();
            entry.formColor = colors[i];
            entry.label = months[i];
            entries.add(entry);
        }
        legend.setCustom(entries);
    }

    private ArrayList<PieEntry> getPieEntries() {
        ArrayList<PieEntry> entries = new ArrayList<>();
        for (int i = 0; i < sale.length; i++)
            entries.add(new PieEntry(sale[i]));
        return entries;
    }

    public void createCharts() {
        pieChart = (PieChart) getSameChart(pieChart, "", Color.GRAY, Color.WHITE, 3000);
        pieChart.setHoleRadius(10);
        pieChart.setTransparentCircleRadius(12);
        pieChart.setDrawHoleEnabled(false);
        pieChart.setData(getPieData());
        pieChart.invalidate();
    }

    private DataSet getData(DataSet dataSet) {
        dataSet.setColors(colors);
        dataSet.setValueTextSize(Color.WHITE);
        dataSet.setValueTextSize(10);
        return dataSet;
    }

    private PieData getPieData() {
        PieDataSet pieDataSet = (PieDataSet) getData(new PieDataSet(getPieEntries(), ""));
        pieDataSet.setSliceSpace(2);
        pieDataSet.setValueFormatter(new PercentFormatter());
        return new PieData(pieDataSet);
    }

    public void muestra() {
        a = db.getRecords();
        arg = a.split(",");

        for (int i = 0; i < arg.length; i++) {

            if (arg[i].equals("Riesgo Bajo")) {
                rb++;
            } else {
                if (arg[i].equals("Riesgo Medio")) {
                    rm++;
                } else {
                    if (arg[i].equals("Riesgo Alto")) {
                        ra++;
                    } else {
                        if (arg[i].equals("Probable adicción")) {
                            pa++;
                        }
                    }
                }
            }
        }

        total = rb + rm + ra + pa;
        CalculatePercents(rb, rm, ra, pa, total);
        tt.setText("Riesgo Bajo: " + rb);
        tt1.setText("Riesgo Medio: " + rm);
        tt2.setText("Riesgo Alto: " + ra);
        tt3.setText("Probable adicción: " + pa);

        tt4.setText("Cantidad de test realizados: " + total);

    }

    private void CalculatePercents(int rb, int rm, int ra, int pa, int total) {
        if (total != 0) {
            sale[0] = rb * 100 / total;
            sale[1] = rm * 100 / total;
            sale[2] = ra * 100 / total;
            sale[3] = pa * 100 / total;
        }else{
            sale[0] = 0;
            sale[1] = 0;
            sale[2] = 0;
            sale[3] = 0;
        }
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
            Intent i = new Intent(historialCAGE.this, Acercade.class);
            startActivity(i);


            return true;

        }
        if (id == R.id.action_settings1) {
            AlertDialog.Builder adb = new AlertDialog.Builder(historialCAGE.this);
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
