package ma.education.tp4.abstractkeyword;

public class Test {
    public static void main(String[] args) {
        FormeGeometrique f1 = new FormeGeometrique() {
            @Override
            public double calculerSurface() {
                return 0;
            }
        };
        FormeGeometrique f2 = new FormeGeoTypeA();
        FormeGeometrique f3 = new FormeGeometrique() {
            @Override
            public double calculerSurface() {
                return 0;
            }
        };
        FormeGeometrique f4 = new FormeGeometrique() {
            @Override // Classe fille Annonyme
            public double calculerSurface() {
                return 22;
            }
        };
    }
}
