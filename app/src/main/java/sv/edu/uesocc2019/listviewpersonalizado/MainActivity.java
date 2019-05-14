package sv.edu.uesocc2019.listviewpersonalizado;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Alumno[] listado = new Alumno[]
            {
                    new Alumno("Carlos", "Ruano", "Sistemas", 1998, "V"),
                    new Alumno("Juan", "Diaz", "Sistemas", 2005, "V"),
                    new Alumno("Patricia", "Magana", "Sistemas", 2000, "V"),
                    new Alumno("Carlos", "Ruano", "Sistemas", 1998, "V"),
                    new Alumno("Juan", "Diaz", "Sistemas", 2005, "V"),
                    new Alumno("Patricia", "Magana", "Sistemas", 2000, "V"),
                    new Alumno("Carlos", "Ruano", "Sistemas", 1998, "V"),
                    new Alumno("Juan", "Diaz", "Sistemas", 2005, "V"),
                    new Alumno("Patricia", "Magana", "Sistemas", 2000, "V")

            };

    private ListView lstAlumnos;

    private AdaptadorAlumnos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adaptador = new AdaptadorAlumnos(this, listado);

        lstAlumnos = (ListView)findViewById(R.id.lstListaAlumnos);
        lstAlumnos.setAdapter(adaptador);

        lstAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View arg1, int position, long arg3) {
                Alumno AlumnoSeleccionado = (Alumno) a.getAdapter().getItem(position);
                Toast.makeText(MainActivity.this, "El Alumno seleccionado es: " + " " +
                        AlumnoSeleccionado.getNombre() + " " + AlumnoSeleccionado.getApellido(), Toast.LENGTH_LONG).show();
            }
        });
    }


    class AdaptadorAlumnos extends ArrayAdapter<Alumno> {

        Activity context;

        public AdaptadorAlumnos(Activity context, Alumno[] datos) {
            super(context, R.layout.alumno_list, datos);

        }

        public View getView(final int posicion, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.alumno_list, null);

            TextView lblNombre = (TextView) item.findViewById(R.id.LblNombre);
            TextView lblApellidos = (TextView) item.findViewById(R.id.LblApellido);
            TextView lblCarrera = (TextView) item.findViewById(R.id.LblCarrera);
            TextView lblCiclo = (TextView) item.findViewById(R.id.LblCicloActual);
            TextView lblAnioIngreso = (TextView) item.findViewById(R.id.LblAnnioIngreso);
            Button btnElimnar = (Button)item.findViewById(R.id.btnEliminar) ;
            lblNombre.setText(listado[posicion].getNombre());

            lblApellidos.setText(listado[posicion].getApellido());
            lblCarrera.setText(listado[posicion].getCarrera());
            lblAnioIngreso.setText(Integer.toString(listado[posicion].getAnnioIngreso()));
            lblCiclo.setText(listado[posicion].getCicloActual());

            btnElimnar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Eliminar " + posicion ,Toast.LENGTH_LONG).show();
                }
            });

            return (item);

        }
    }
}
