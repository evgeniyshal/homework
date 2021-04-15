package homework.coursework;

import java.time.LocalDateTime;
import java.util.Objects;

public class Membership { // Абонимент в тренажерный зал

    private MembershipType membershipType; // Тип абонимента
    private LocalDateTime registerDate; // Дата начала действия абонемента
    private LocalDateTime expireDate; // Дата окончания действия абонемента
    private MemberInfo memberInfo; // информации о владельце

    public Membership(MembershipType membershipType, LocalDateTime registerDate, MemberInfo memberInfo) {  //
        this.membershipType = membershipType;
        this.registerDate = registerDate;
        this.expireDate = registerDate.plusYears(1);
        this.memberInfo = memberInfo;
    }

    public MembershipType getMembershipType(){
        return membershipType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Membership)) return false;
        Membership that = (Membership) o;
        return membershipType == that.membershipType && Objects.equals(registerDate, that.registerDate) && Objects.equals(expireDate, that.expireDate) && Objects.equals(memberInfo, that.memberInfo);
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }
}


