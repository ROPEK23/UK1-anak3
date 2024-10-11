
public class Soda extends Minuman {
    private String karbonasi;

    // Constructor
    public Soda(String nama, String rasa, String karbonasi) {
        super(nama, rasa);  // Memanggil constructor induk
        this.karbonasi = karbonasi;
    }

    // Overriding constructor
    public Soda() {
        this("Soda", "Asam", "Tidak Diketahui");
    }

    // Getter dan Setter untuk karbonasi
    public void setKarbonasi(String karbonasi) {
        this.karbonasi = karbonasi;
    }

    public String getKarbonasi() {
        return karbonasi;
    }


    public String info() {
        return getNama() + " memiliki rasa " + getRasa() + " dan karbonasi " + karbonasi;
    }
}

