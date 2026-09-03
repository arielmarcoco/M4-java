package S11.Estacion;

    public class AutoElectrico implements Recargable {
        private String modelo;
        public AutoElectrico(String modelo){
            this.modelo = modelo;
        }
        @Override
        public void iniciarCarga(){
            System.out.println("Conectando clabe de alta tension... Cargando bateria de auto"+modelo+".");

        }
    }
