package com.boyboy0710.WA_Sends;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("WA_Sends");

    }

    @Override
    public void onDisable() {
        System.out.println("WA_Sends");
    }

    boolean start = false;
    boolean end = false;
    int trun = 0;
    int a = 0;
    int my_trun = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(label.equalsIgnoreCase("WA_Sands")) {
            Player p = (Player) sender;
            p.getInventory().clear();
            setSandsStats((LivingEntity) p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON));
            p.sendMessage("안녕?");
            p.sendMessage("꽤 바빴었지 응?");
            p.sendMessage("...");
            p.sendMessage("물어볼 게 하나 있어");
            p.sendMessage("가장 나쁜사람이라 할지라도 바뀔수 있을까?");
            p.sendMessage("노력만 한다면, 모두가 착한 사람이 될수 있을까?");
            p.sendMessage("");
            p.sendMessage("헤 헤 헤....");
            p.sendMessage("좋아");
            p.sendMessage("여기, 더 괜찮은 질문이 있어");
            p.sendMessage(ChatColor.RED + "끔찍한 시간을 보내고 싶어?");

            start = true;
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,1,1));
            p.sendMessage("당신은 끔직한 시간을 보낼것 같다");

            trun = 1;
            a = 1;
        }

        return false;
    }

    public void setSandsStats(LivingEntity entity) {
        entity.setAI(false);
        entity.setMaxHealth(1000000);
        entity.setHealth(1000000);
        entity.setGlowing(true);

    }

    @EventHandler
    public void entityDeath(EntityDeathEvent e, Player p){
        int Death = 0;
        if(e.getEntity().getType() == EntityType.SKELETON) {
            if(trun == 1) {
                if(Death == 5) {
                    Death = 0;
                    p.getInventory().clear();
                    p.sendMessage("당신은 죄악이 등을 타고오르는것을 느꼈다");

                }

                else {
                    Death = Death + 1;
                }
            }
        }


    }

    public void Sands_trun(Player p) {
        if(a == 1) {
            if(trun == 1) {
                p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON);
                p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON);
                p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON);
                p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON);
                p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.SKELETON);
                a = 0;
                p.sendMessage("왜 다들 처음부터 강한 공격을 쓰지 않는지 모르겠다니까");
                p.getInventory().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
            }
        }
    }

    public void talk(Player p) {
        if(trun == 1) {
            p.sendMessage("뭐? 내가 가만히 서서 맞아줄거라 생각했어?");
        }
        if(trun == 2) {
            p.sendMessage("우린 시공간에 막대한 변칙이 있다는걸 발견했어");
            p.sendMessage("시간축이 좌충우돌 움직이고, 멈추고 다시 시작하지...");
        }
        if(trun == 3){
            p.sendMessage("그리고 갑자기 모든것이 끝나버려");
        }
        if(trun == 4){
            p.sendMessage("헤 헤 헤 ...");
            p.sendMessage("네가 그런거지? 응?");
        }
        if(trun == 5){
            p.sendMessage("너는 어떤 느낌인지 이해 못할껄?");
        }
        if(trun == 6){
            p.sendMessage("어느날 갑자기, 아무 말 없이...");
            p.sendMessage("모든 게 리셋된다는 사실을 안다는걸 말이야");
        }
        if(trun == 7){
            p.sendMessage("이봐 난 이미 되돌아가는걸 포기했어");
        }
        if(trun == 8){
            p.sendMessage("바깥 세상에 나가는것도 더이상 관심없고");
        }
        if(trun == 9){
            p.sendMessage("나간다고 한들... 아무 기억없이, 여기로 되돌아와있을테니까. 그치?");
        }
        if(trun == 10){
            p.sendMessage("솔직히 말하자면...");
            p.sendMessage("그래서 내가 매사에 최선을 다하질 못해");
        }
        if(trun == 11){
            p.sendMessage(". . . 아니면 내 게으름에 대한 변명인건가...?");
            p.sendMessage("알게 뭐야");
        }

        if(trun == 12) {
            p.sendMessage("그냥... 다음에 벌어질 일을 알고있자니....");

        }
        if(trun == 13) {

        }
        if(trun == 14){

        }
        if(trun == 15){

        }
        if(trun == 16){

        }
        if(trun == 17){

        }
        if(trun == 18){

        }
        if(trun == 19){

        }
        if(trun == 20){

        }
        if(trun == 21){

        }
        if(trun == 22){

        }
    }

}
