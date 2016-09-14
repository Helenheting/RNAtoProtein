# RNAtoProtein

##Biological background:
1.Some proteins are composed of several subchains called polypeptides, while others are formed of a single polypeptide.~polypeptide多肽链~
2.The apparent difficulty in translation is that somehow 4 RNA bases must be translated into a language of 20 amino acids;in order for every possible amino acid to be created, we must translate 3-nucleobase strings (called codons) into amino acids.~codons密码子~
3.Note that there are 43=64 possible codons, so that multiple codons may encode the same amino acid.Two special types of codons are the start codon (AUG), which codes for the amino acid methioninealways indicates the start of translation, and the three stop codons (UAA, UAG, UGA),which do not code for an amino acid and cause translation to end.~methionine甲硫氨酸~
4.A eukaryotic organelle called a ribosome creates peptides byusing a helper molecule called transfer RNA (tRNA).A single tRNA molecule possesses a string of three RNA nucleotides on one end (called an anticodon) and an aminoacid at the other end.  ~eukaryotic organelle真核细胞，ribosome核糖体，anticodon反密码子~

##Problem:
The 20 commonly occurring amino acids are abbreviated by using 20 letters from the English alphabet (all letters except for B, J, O, U, X, and Z). Protein strings are constructed from these 20 symbols. Henceforth, the term genetic string will incorporate protein strings along with DNA strings and RNA strings.
The RNA codon table dictates the details regarding the encoding of specific codons into the amino acid alphabet.
Given: An RNA string s corresponding to a strand of mRNA (of length at most 10 kbp).
Return: The protein string encoded by s.
