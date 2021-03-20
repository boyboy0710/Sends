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
            p.sendMessage("그냥... 다음에 벌어질 일을 알고있자니...");
            p.sendMessage("더 이상 신경끄기 어렵다 이거야");

        }
        if(trun == 13) {
            p.sendMessage("뭐, 시도해 볼 만 했어.");
            p.sendMessage("그런 식으로 해 보자, 이거지?");

        }
        if(trun == 14){
            p.sendMessage("이상하겠지만,");
            p.sendMessage("이 일 전까진 우리가 친구가 될 거라고 내심 기대했었거든.");
            p.sendMessage("시간이 불규칙한 건 불만족으로 생긴 일이라고 늘 생각했었지.");
            p.sendMessage("그리고 원하는 걸 얻고 나면, 그 짓을 멈춰줄 거라 생각했어.");
        }
        if(trun == 15){
            p.sendMessage("아마도 걔들이 원하던 건... 글쎄.");
            p.sendMessage("좋은 음식, 따뜻한 농담, 좋은 친구들이었으려나.");
        }
        if(trun == 16){
            p.sendMessage("근데 그럴 리가 없지, 안 그래?");
            p.sendMessage("그래, 넌 절대 만족할 수 없는 부류잖아.");
        }
        if(trun == 17){
            p.sendMessage("넌 계속해서 시간을 허비하고 허비하겠지, 계속해서...");
            p.sendMessage("뭐.야.");
            p.sendMessage("내 말 잘 들어둬, 꼬마.");
            p.sendMessage("언젠가...");
            p.sendMessage("그만두는 법을 배워야 할 거야.");
        }
        if(trun == 18){
            p.sendMessage("그리고 그게 바로 오늘이지.");
        }
        if(trun == 19){
            p.sendMessage("왜냐하면... 너도 알겠지만...");
            p.sendMessage("이 싸움 정말 지긋지긋하거든.");
        }
        if(trun == 20){
            p.sendMessage("그리고 네가 계속 나를 밀어붙인다면...");
            p.sendMessage("내 필살기를 사용할 수 밖에 없을 거야.");
        }
        if(trun == 21){
            p.sendMessage("그래, 필살기. 어디서 많이 들어 봤지?");
            p.sendMessage("그래, 준비하라고. 이 다음 번에, 사용할 거거든.");
            p.sendMessage("그러니 보기 싫다면, 지금이 죽기 딱 좋은 때야.");

        }
        if(trun == 22){
            p.sendMessage("자, 별 거 없지만 간다...");
            p.sendMessage("준비 됐어?");
            p.sendMessage("이번 공격을 버티면, 내 필살기를 보여 주지");
        }
        if(end == true) {
            p.sendMessage("헉... 헉...");
            p.sendMessage("좋아. 이제 끝이야.");
            p.sendMessage("내 필살기를 사용해야겠군.");
            p.sendMessage("준비 됐어?");
            p.sendMessage("별 거 없지만 간다.");

            p.sendMessage("");
            p.sendMessage("그래.");
            p.sendMessage("맞아.");
            p.sendMessage("말 그대로 별 거 없는 거야.");
            p.sendMessage("그리고 어떤 일도 일어나지 않겠지.");
            p.sendMessage("헤 헤 헤... 알아 들었어?");
            p.sendMessage("내가 널 이길 수 없다는 걸 알아.");
            p.sendMessage("네 턴이 돌아오면...");
            p.sendMessage("넌 날 죽이겠지.");
            p.sendMessage("그래서, 말야.");
            p.sendMessage("결심했는데...");
            p.sendMessage("네 턴이 오는 날은 없을 거야. 절대로.");
            p.sendMessage("세상이 끝날 때까지 서 있어야 한다고 해도,");
            p.sendMessage("네가 포기할 때까지 난 계속 내 턴을 유지할 거야. 알겠지?");

            p.sendMessage("곧 지루해질 거야.");
            p.sendMessage("아직까지도 지루해지지 않았다면 말야.");
            p.sendMessage("그리고 좀 있으면, 결국 그만두겠지.");

            p.sendMessage("너 같은 부류는 잘 알고 있어.");
            p.sendMessage("넌, 음, 의지가 매우 강해, 그렇지?");
            p.sendMessage("정말로 아무런 이득이 없어도...");
            p.sendMessage("절대 포기하지 않겠지.");
            p.sendMessage("정확히 말하자면.");
            p.sendMessage("무슨 일이 있건, 계속 나아가겠지.");
            p.sendMessage("네 욕망이 선하든 나쁘든 간에...");
            p.sendMessage("단지 네가 할 수 있다고 믿으니까.");
            p.sendMessage("그리고 할 수 있으니까...해야만 하는 거겠지.");
            p.sendMessage("하지만 이젠, 넌 끝까지 왔어.");
            p.sendMessage("네 앞에 이제 남은건 없어");
            p.sendMessage("그래서 말야, 개인적인 생각인데...");
            p.sendMessage("이쯤에서 네 의지로 할 만한 건 뭐가 있을까?");
            p.sendMessage("지금 당장 모든 걸 포기하는 거야.");
            p.sendMessage("그리고... (흐암) 말 그대로 다른 일이나 하는 거지.");

            p.sendMessage("헤, 너 정말 그게 가능할 거라 생각");
            p.sendMessage("");
            p.sendMessage("...");
            p.sendMessage("...");
            p.sendMessage("...");
            p.sendMessage("그래...");
            p.sendMessage("결국 이렇게, 되는 건가?");
            p.sendMessage("...");
            p.sendMessage("그냥...");
            p.sendMessage("경고 안 했다고만 하지 말아 줘.");

            p.sendMessage("뭐");
            p.sendMessage("그릴비나 가야겠군");

            p.sendMessage("파피루스, 뭐 먹고싶은 거 없어?");
        }
    }

}
