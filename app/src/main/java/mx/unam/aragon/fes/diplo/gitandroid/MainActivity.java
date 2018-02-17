    package mx.unam.aragon.fes.diplo.gitandroid;

    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.util.Log;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {
        private Button boton;
        private TextView txtSalida;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            boton=findViewById(R.id.boton);
            txtSalida=findViewById(R.id.txtLabel);


            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.v("diplo", "Evento lanzado" + txtSalida.getText());
                    txtSalida.setText("Hola Git");

                }

            });

        }
    }