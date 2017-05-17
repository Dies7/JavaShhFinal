package game;


public abstract class GameBase
{

	private boolean running;

	public abstract void init();

	public abstract void initGL();

	public abstract void update(float dt);

	public abstract void render();

	public abstract void cleanUp();

	public boolean isRunning()
	{
		return running;
	}

	public void start()
	{
		if (running) return;
		running = true;
	}

	public void stop()
	{
		if (!running) return;
		running = false;
	}

}