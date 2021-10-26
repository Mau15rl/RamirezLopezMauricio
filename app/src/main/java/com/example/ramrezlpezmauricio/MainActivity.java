package com.example.ramrezlpezmauricio;
/**
 * @author Mauricio Ramírez López
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Settings>  ConfigurationList;
    private SettingsAdapter settingsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConfigurationList = new ArrayList<>();

        ConfigurationList.add(new Settings("Conexiones", "WIFI, Bluetooth, red móvil, uso de datos y hotspot", R.drawable.wifi3 ));

        ConfigurationList.add(new Settings("Sonido y vibración", "Volumen, vibración, No interrumpir", R.drawable.sonido ));

        ConfigurationList.add(new Settings("Apps y notificaciones", "Apps recientes, notificaciones de aplicaciones, barra de estado", R.drawable.notification2 ));

        ConfigurationList.add(new Settings("Pantalla", "Nivel de brillo, Tema, Luz nocturna, tamaño de fuente, tiempo de espera", R.drawable.screen ));

        ConfigurationList.add(new Settings("Fondo de pantalla", "Filtro de luz azul, pantalla de inicio", R.drawable.wallpaper ));

        ConfigurationList.add(new Settings("Temas", "Temas, fondos de pantalla, fondo de pantalla de bloqueo", R.drawable.themes ));

        ConfigurationList.add(new Settings("Seguridad", "Bloqueo de pantalla, huella digital, desbloqueo facial, Smart Lock", R.drawable.security ));

        ConfigurationList.add(new Settings("Ubicación", "Ajustes de ubicación, solicitud de ubicación", R.drawable.location ));

        ConfigurationList.add(new Settings("Actualización del sistema", "Se actualizó a Android 11", R.drawable.update ));


        settingsAdapter = new SettingsAdapter(getApplicationContext(),0,ConfigurationList);
        ListView listView = findViewById(R.id.product_listview);
        listView.setAdapter(settingsAdapter);
    }
}