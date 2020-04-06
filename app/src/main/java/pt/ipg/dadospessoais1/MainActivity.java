package pt.ipg.dadospessoais1;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ButtonSubmeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText EditTextNome = findViewById(R.id.editTextNome);
        EditText EditTextEmail = findViewById(R.id.editTextEmail);
        EditText EditTextIdade = findViewById(R.id.editTextIdade);
        EditText EditTextTelefone = findViewById(R.id.editTextTelefone);
        EditText EditTextPeso = findViewById(R.id.editTextPeso);
        ButtonSubmeter = (Button) findViewById(R.id.buttonSubmeter);

        String nome = EditTextNome.getText().toString();
        String email = EditTextEmail.getText().toString();
        String idade = EditTextIdade.getText().toString();
        String telefone = EditTextTelefone.getText().toString();
        String peso = EditTextPeso.getText().toString();

        ButtonSubmeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Dados pessoais adicionados", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
