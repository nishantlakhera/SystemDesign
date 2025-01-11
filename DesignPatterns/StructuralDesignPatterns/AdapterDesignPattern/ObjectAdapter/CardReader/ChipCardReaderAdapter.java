public class ChipCardReaderAdapter implements CardReader{
    private ChipCardReader chipCardReader;
    public ChipCardReaderAdapter(ChipCardReader chipCardReader){
        this.chipCardReader = chipCardReader;
    }
    @Override
    public void readCard() {
        chipCardReader.insertChipCard();
    }

    @Override
    public void validateCard() {
        chipCardReader.verifyChipCard();
    }
}
