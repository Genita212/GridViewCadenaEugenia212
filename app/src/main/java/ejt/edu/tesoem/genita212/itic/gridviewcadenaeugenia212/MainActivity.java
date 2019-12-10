package ejt.edu.tesoem.genita212.itic.gridviewcadenaeugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos=findViewById(R.id.gvDatos);

        String[] arreglo= new String[]{"nom1","nom2","nom3","nom4"
                ,"nom5","nom6","nom7","nom8","nom9","nom10","nom11","nom12"
                ,"nom13","nom14","nom15","nom16","nom17","nom18","nom19","nom20"
                ,"nom21","nom22","nom23","nom24","nom25","nom26","nom27","nom28"
                ,"nom29","nom30","nom31","nom32","nom33","nom34","nom35","nom36"
                ,"nom37","nom38","nom39","nom40","nom41","nom42","nom43","nom44"
                ,"nom45","nom46","nom47","nom48","nom49","nom50","nom51","nom52"
                ,"nom53","nom54","nom55","nom56","nom57","nom58","nom59","nom60"
                ,"nom61","nom62","nom63","nom64","nom65","nom66","nom67","nom68"
                ,"nom69","nom70","nom1","nom72","nom73","nom74","nom75","nom76"
                ,"nom77","nom78","nom79","nom80"};
        ArrayAdapter adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        gvDatos.setAdapter(adaptador);
    }
}
