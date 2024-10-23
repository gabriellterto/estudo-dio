package exemplo.equipamentos.estabelecimento;

import exemplo.equipamentos.copiadora.Copiadora;
import exemplo.equipamentos.digitalizadora.Digitalizadora;
import exemplo.equipamentos.impressora.DeskJet;
import exemplo.equipamentos.impressora.Impressora;
import exemplo.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        DeskJet deskJet = new DeskJet();

        Impressora impressora = deskJet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
