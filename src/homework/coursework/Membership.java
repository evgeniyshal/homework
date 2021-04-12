package homework.coursework;

import java.time.LocalDateTime;

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

    public LocalDateTime getExpireDate() {
        return expireDate;
    }
}


