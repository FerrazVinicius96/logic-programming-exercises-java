import java.util.HashMap;
import java.util.Map;

public class Professor {

    private String nome;
    private Double valorPorHora;

    private Map<Integer, Integer> mesHrTrabalhada = new HashMap<>();

    public Professor() {
    }

    public Professor(String nome, double valorPorHora) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Map<Integer, Integer> getMesHrTrabalhada() {
        return mesHrTrabalhada;
    }

    public void setMesHrTrabalhada(Map<Integer, Integer> mesHrTrabalhada) {
        this.mesHrTrabalhada = mesHrTrabalhada;
    }

    public void addRegistro(int mes, int hrTrabalhada) {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido");

        if (hrTrabalhada < 0)
            throw new IllegalArgumentException("Hora não pode ser negativa");

        mesHrTrabalhada.put(mes, hrTrabalhada);
    }

    public double getRemuneracaoMensal(int mes) {

        int horas = mesHrTrabalhada.getOrDefault(mes, 0);
        return horas * this.valorPorHora;
    }

    public double getRemuneracaoTotalAcumulada() {

        return mesHrTrabalhada.values().stream()
                .mapToDouble(horas -> horas * this.valorPorHora)
                .sum();
    }
}
