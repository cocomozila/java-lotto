package lotto.domain;

import lotto.setting.Setting;
import lotto.util.Input;

import java.util.List;

public class LottoMachine {

    private Money money;
    private LottoStore lottoStore;
    private WinningNumber winningNumber;

//  돈 입력 기능
    public void inputMoney() throws IllegalArgumentException {
        money = new Money(Input.input());
    }

//  구매 개수 반환 기능
    public int getLottoCount() {
        return (int)(money.getMoney() / Setting.PURCHASE_AMOUNT_UNIT);
    }

//  금액 만큼 로또 구매하기
    public void buyLottos(int lottoCount) {
        this.lottoStore = new LottoStore(lottoCount);
    }

    // 구매한 로또 반환 기능
    public List<List<Integer>> getBuyLottos() {
        return lottoStore.getLottos();
    }

    // 당첨 번호 생성 기능
    public void inputWinningNumber() throws IllegalArgumentException {
        this.winningNumber = new WinningNumber();
        winningNumber.inputWinningNumber(Input.input());
    }

//    당첨 결과 반환 기능
//    public List<Integer> getLottoResult() {}

//    당첨 수익률 반환 기능
//    public double getYield() {}
}
