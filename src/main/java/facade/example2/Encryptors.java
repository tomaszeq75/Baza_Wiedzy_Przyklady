package facade.example2;

public interface Encryptors {
    String encryptWithoutModification(final String toEncrypt);
    String encryptWithBCrypt(final String toEncrypt);
    String encryptWithSCrypt(final String toEncrypt);
}
