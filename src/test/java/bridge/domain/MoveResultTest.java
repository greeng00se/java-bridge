package bridge.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("MoveResult Enum")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MoveResultTest {

    @ParameterizedTest
    @CsvSource({"SUCCESS, O", "FAIL, X"})
    void getInitialLetter_메서드는_성공일_경우_O_실패일_경우_X를_반환한다(MoveResult moveResult, String initialLetter) {
        assertThat(moveResult.getInitialLetter()).isEqualTo(initialLetter);
    }
}
