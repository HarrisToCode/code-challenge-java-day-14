import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProteinTranslator {
    List<String> translate(String rnaSequence) {
        List<String> protein = new ArrayList<>();
        String[] codons = rnaSequence.split("(?<=\\G.{3})");
        List<String> Methionine = Arrays.asList("AUG");
        List<String> Phenylalanine = Arrays.asList("UUU", "UUC");
        List<String> Leucine = Arrays.asList("UUA", "UUG");
        List<String> Serine = Arrays.asList("UCU", "UCC", "UCA", "UCG");
        List<String> Tyrosine = Arrays.asList("UAU", "UAC");
        List<String> Cysteine = Arrays.asList("UGU", "UGC");
        List<String> Tryptophan = Arrays.asList("UGG");
        List<String> STOP = Arrays.asList("UAA", "UAG", "UGA");
        for (String codon :
                codons) {
            if (STOP.contains(codon)) break;
            if (Methionine.contains(codon)) protein.add("Methionine");
            if (Phenylalanine.contains(codon)) protein.add("Phenylalanine");
            if (Leucine.contains(codon)) protein.add("Leucine");
            if (Serine.contains(codon)) protein.add("Serine");
            if (Tyrosine.contains(codon)) protein.add("Tyrosine");
            if (Cysteine.contains(codon)) protein.add("Cysteine");
            if (Tryptophan.contains(codon)) protein.add("Tryptophan");
        }
        return protein;
    }
}