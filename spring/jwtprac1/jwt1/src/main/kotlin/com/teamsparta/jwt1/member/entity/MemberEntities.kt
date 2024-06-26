package com.teamsparta.jwt1.member.entity

import com.teamsparta.jwt1.common.status.Gender
import com.teamsparta.jwt1.common.status.ROLE
import com.teamsparta.jwt1.member.dto.MemberDtoResponse
import jakarta.persistence.*
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Entity
@Table(
    name="member",
    uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])]
)
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false, length = 30, updatable = false)
    val loginId: String,

    @Column(nullable = false, length = 100)
    val password:String,

    @Column(nullable = false, length = 10)
    val name: String,

    @Column(nullable = false)
    val birthDate: LocalDate,

    @Column(nullable = false, length = 5)
    @Enumerated(EnumType.STRING)
    val gender: Gender,

    @Column(nullable = false, length = 30)
    val email: String
    ){
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
    val memberRole: List<MemberRole>? = null

    private fun LocalDate.formatDate(): String =
        this.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    fun toDto(): MemberDtoResponse =
        MemberDtoResponse(
            id!!,
            loginId,
            name,
            birthDate.formatDate(),
            gender.desc,
            email
        )

}
@Entity
class MemberRole(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    val role: ROLE,

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(foreignKey = ForeignKey(name = "fk_member_role_member_id"))
   val member:Member
)

